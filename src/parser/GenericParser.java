package parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import parser.antlr4.*;
import parser.antlr4.UPPAALTraceParser.*;
import traceModel.*;

/** A note from the author.
 * 
 *  This class and a lot of others in the package traceModel contain methods annotated 
 *  with ANTLR grammar rules that specify the specifics handled in that method.
 *  When in doubt, it might prove useful to verify the specific rule with the 
 *  grammar(UPPAALTrace.g4). Grammar rules might change during development, and updating 
 *  method specifications accordingly might be forgotten.
 * 
 * @author Jacco Brandt<j.h.brandt@student.utwente.nl>
 *
 */


public class GenericParser extends UPPAALTraceBaseVisitor<Object> {
	
	public ArrayList<State> states = new ArrayList<State>();
	protected State visitingState = null;
	
	// visit all states in trace
	public Void visitTrace(TraceContext ctx) {
		
		StateContext statectx;
		
		if (ctx.firstState() != null) {
			
			statectx = ctx.firstState().state();
			this.visitingState = new State();
			this.states.add(this.visitingState);
			
			this.visitingState.setTransition(new NoTransition()); // first state has no transition
			this.visit(statectx);
			
		}
		
		for (int i = 0; i < ctx.gotoState().size(); i++) {

			statectx = ctx.gotoState(i).state();
			this.visitingState = new State();
			this.states.add(this.visitingState);
			
			// add transition and visit state
			this.visitingState.setTransition((Transition) this.visit(ctx.gotoState(i).transition()));
			this.visit(statectx);
			
		}
		
		return null;
	}
	/**----------------------------------TRANSITITIONS-------------------------------**/
	// stateA -> stateB (guard; sync?; assignments)
	public Transition visitTransitionState(TransitionStateContext ctx) {
		StatesTransition trans = new StatesTransition();
		// TODO visit childs and apply on trans
		List<TransitionDetailsContext> transitions = ctx.transitionDetails();
		for (int i = 0; i < transitions.size(); i++) {
			// states & guard
			String stateA = (String) this.visit(transitions.get(i).systemState(0));
			String stateB = (String) this.visit(transitions.get(i).systemState(1));
			Object guards = this.visit(transitions.get(i).transitionGuard());
			// sync optional
			Object syncs = null; // TODO: child implementation + infer object type
			if (transitions.get(i).synchronization() != null)
				syncs = this.visit(transitions.get(i).synchronization());
			
			// assignments TODO: infer object type + child implementation
			Object assignments = visit(transitions.get(i).transitionAssignments());
						
			// TODO: add loop variables as stateTransition to StatesTransition variable (local trans)
			
			
		}
		
		return trans;
	}

	// time (+REAL)
	public Transition visitTransitionDelay(TransitionDelayContext ctx) {
		float delayTime = Float.parseFloat(ctx.REAL().toString());
		return new DelayTransition(delayTime);
	}
	/**----------------------------------STATES-------------------------------------**/
	// (systemStates; variables; clocks)
	@SuppressWarnings("unchecked")
	public Void visitState(StateContext ctx) {
		
		String[] states = (String[]) visit(ctx.systemStates());
		HashMap<String, String> variables = (HashMap<String, String>)visit(ctx.variables());
		
		// assign to current state
		this.visitingState.setStates(states);
		this.visitingState.setVariables(variables);
		this.visitingState.setClocks(new ArrayList<Clock>(ctx.clocks().clock().size()));
		// the clock method appends it instances to the visiting state, 
		// no need to handle resulting values here
		visit(ctx.clocks()); 
		
		return null;
	}
	/**----------------------------------VARIABLES----------------------------------**/
	// get all variable values in hashmap 
	public HashMap<String, String> visitVariables(VariablesContext ctx) {
		HashMap<String, String> variables = new HashMap<String, String>();
		
		// loop over variables and assign value
		int length = ctx.variable().size();
		for (int i = 0; i < length; i++) {
			String value = (String) this.visit(ctx.variable(i).value());
			variables.put(ctx.variable(i).OBJECTREF().toString(), value);
		}
		
		return variables;
	}
	
	/**----------------------------------CLOCKS -----------------------------------**/
	// clocks => clock*?
	public Void visitClocks(ClocksContext ctx) {
		int length = ctx.clock().size();
		
		for (int i = 0; i < length; i++) {
			// visitClock(ClockContext) appends itself to the currently visiting state,
			// so there is no need to handle result values
			visit(ctx.clock(i));
		}

		return null;
	}
	
	// clock => (clockLHS; relation; REAL)
	public Void visitClock(ClockContext ctx) {
		
		// add new clock to current state 
		Clock clock = new Clock();
		this.visitingState.getClocks().add(clock);

		// defer relation and value
		Clock.Relation relation = Clock.Relation.getByText((ctx.relation().getText()));
		if (relation == null)
			throw new RuntimeException("Unregistered operant: " + ctx.relation().getText() + ", please add to grammar rule 'relation' and apply in traceModel.Clock.Relation.");
		float value = Float.valueOf(ctx.REAL().toString());
		
		clock.setRelation(relation);
		clock.setValue(value);
		
		// determine left-hand side
		Clock.LHS LHS = (traceModel.Clock.LHS) visit(ctx.clockLHS());
		clock.setLHS(LHS);
		return null;
	}
	
	// visitClockLHS(ClockLHSContext ctx) is implemented through the following 4 methods
	// ClockLHS => T(0) - OBJECTREF
	public Clock.LHS visitClockLHSZeroMinusObject(ClockLHSZeroMinusObjectContext ctx) {
		List<Clock> clocks = this.visitingState.getClocks();
		return clocks.get(clocks.size()-1).new LHS(null, ctx.OBJECTREF().toString());
	}
	// ClockLHS => OBJECTREF - T(0)
	public Clock.LHS visitClockLHSObjectMinusZero(ClockLHSObjectMinusZeroContext ctx) {
		List<Clock> clocks = this.visitingState.getClocks();
		return clocks.get(clocks.size()-1).new LHS(ctx.OBJECTREF().toString());
	}
	// ClockLHS => OBJECTREF - OBJECTREF
	public Clock.LHS visitClockLHSObjectMinusObject(ClockLHSObjectMinusObjectContext ctx) {
		List<Clock> clocks = this.visitingState.getClocks();
		return clocks.get(clocks.size()-1).new LHS(ctx.OBJECTREF(0).toString(), ctx.OBJECTREF(1).toString());
	}
	// ClockLHS => OBJECTREF
	public Clock.LHS visitClockLHSObject(ClockLHSObjectContext ctx) {
		List<Clock> clocks = this.visitingState.getClocks();
		return clocks.get(clocks.size()-1).new LHS(ctx.OBJECTREF().toString());
	}
	 
	/**----------------------------------RULES TO STRINGS------------------------------**/
	
	// multiple system states to string array
	public String[] visitSystemStates(SystemStatesContext ctx) {
		int length = ctx.systemState().size();
		String[] states = new String[length ];
		for (int i = 0; i < length; i++)
			states[i] = (String) visit(ctx.systemState(i));
		
		return states;
	}
	
	// single system state to string
	public String visitSystemState(SystemStateContext ctx) {
		return ctx.OBJECTREF().toString();
	}
	
	// value => BOOL|REAL; to string
	public String visitValue(ValueContext ctx) {
		if (ctx.BOOL() != null)
			return ctx.BOOL().toString();
		return ctx.REAL().toString();
	}
	
}
