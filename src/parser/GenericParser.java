package parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import parser.antlr4.*;
import parser.antlr4.UPPAALTraceParser.*;
import traceModel.*;
import traceModel.StatesTransition.StateTransition;

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
			// no states in transition?
			if (((StatesTransition) (this.visitingState.getTransition())).size() == 0)
				this.visitingState.setTransition(new NoTransition());
			this.visit(statectx);
			
		}
		
		return null;
	}
	/**----------------------------------TRANSITIONS-------------------------------**/
	// stateA -> stateB (guard; sync?; assignments)
	@SuppressWarnings("unchecked") // Sorry
	public Transition visitTransitionState(TransitionStateContext ctx) {
		StatesTransition trans = new StatesTransition();
		
		List<TransitionDetailsContext> transitionDetails = ctx.transitionDetails();
		for (int i = 0; i < transitionDetails.size(); i++) {
			// generate new sub transition and apply to list
			StateTransition stateTrans = trans.new StateTransition();
			trans.addTransition(stateTrans);
			
			// states & guard
			String stateA = (String) this.visit(transitionDetails.get(i).systemState(0));
			String stateB = (String) this.visit(transitionDetails.get(i).systemState(1));
			String guard  = (String) this.visit(transitionDetails.get(i).transitionGuard());
			stateTrans.setStateA(stateA);
			stateTrans.setStateB(stateB);
			stateTrans.setGuard(guard);

			// sync optional
			List<Pair<String, Boolean>> syncs = null;
			if (transitionDetails.get(i).synchronization() != null)
				syncs = (List<Pair<String, Boolean>>) this.visit(transitionDetails.get(i).synchronization());
			stateTrans.setSynchronization(syncs);
			
			// assignments
			Map<String, String> assignments = (Map<String, String>) visit(transitionDetails.get(i).transitionAssignments());
			stateTrans.setAssignments(assignments);
			
		}
		
		return trans;
	}

	// time (+REAL)
	public Transition visitTransitionDelay(TransitionDelayContext ctx) {
		float delayTime = Float.parseFloat(ctx.REAL().getText());
		return new DelayTransition(delayTime);
	}
	
	// transitionGuard: expr;
	public String visitTransitionGuard(TransitionGuardContext ctx) {
		// might be extended to include expression parsing, 
		// this is thought to be unnescessary at this moment
		return ctx.expr().getText();   
	}
	
	@SuppressWarnings("unchecked")
	public List<Pair<String, Boolean>> visitSynchronization(SynchronizationContext ctx) {
		// 0 or 1 as synchronisation means no synchronisation
		if (ctx.value() != null)
			return null;
		// get syncs
		// Pair<Name, Bool> Bool == true -> outgoing synchronization; Bool == false -> ingoing synchronization
		return (List<Pair<String, Boolean>>) visit(ctx.syncExpr());
	}
	
	@SuppressWarnings("unchecked")
	// Pair<Name, Bool> Bool == true -> outgoing synchronization; Bool == false -> ingoing synchronization
	public List<Pair<String, Boolean>> visitSyncExpr(SyncExprContext ctx) {
		
		// sub expressions
		// syncExpr = syncExpr AND syncExpr
		if (ctx.syncExpr().size() == 2) {
			List<Pair<String, Boolean>> sub0 = (List<Pair<String, Boolean>>) visit(ctx.syncExpr(0));
			List<Pair<String, Boolean>> sub1 = (List<Pair<String, Boolean>>) visit(ctx.syncExpr(1));
			List<Pair<String, Boolean>> res  = new ArrayList<Pair<String, Boolean>>(sub0.size() + sub1.size());
			res.addAll(sub0);
			res.addAll(sub1);
			return res;
		}
		
		// one synchronization
		// syncExpr = OBJECTREF EXCL? | OBJECTREF QM
		List<Pair<String, Boolean>> res = new ArrayList<Pair<String, Boolean>>(1);
		res.add(new Pair<String, Boolean>(ctx.OBJECTREF().getText(), (Boolean) (ctx.QM() == null)));
		return res;
	}
	
	public Map<String, String> visitTransitionAssignments(TransitionAssignmentsContext ctx) {
		HashMap<String, String> assignments = new HashMap<String, String>();
		if (ctx.assignments() != null) {
			for(int i = 0; i < ctx.assignments().assignment().size(); i++) {
				assignments.put(ctx.assignments().assignment(i).OBJECTREF().getText(), (String) visit(ctx.assignments().assignment(i).value()));
			}
		}
		if (ctx.variables() != null) {
			for(int i = 0; i < ctx.variables().variable().size(); i++) {
				assignments.put(ctx.variables().variable(i).OBJECTREF().getText(), (String) visit(ctx.variables().variable(i).value()));
			}
		}
		return assignments;
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
			variables.put(ctx.variable(i).OBJECTREF().getText(), value);
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
		float value = Float.valueOf(ctx.REAL().getText());
		
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
		return clocks.get(clocks.size()-1).new LHS(null, ctx.OBJECTREF().getText());
	}
	// ClockLHS => OBJECTREF - T(0)
	public Clock.LHS visitClockLHSObjectMinusZero(ClockLHSObjectMinusZeroContext ctx) {
		List<Clock> clocks = this.visitingState.getClocks();
		return clocks.get(clocks.size()-1).new LHS(ctx.OBJECTREF().getText());
	}
	// ClockLHS => OBJECTREF - OBJECTREF
	public Clock.LHS visitClockLHSObjectMinusObject(ClockLHSObjectMinusObjectContext ctx) {
		List<Clock> clocks = this.visitingState.getClocks();
		return clocks.get(clocks.size()-1).new LHS(ctx.OBJECTREF(0).getText(), ctx.OBJECTREF(1).getText());
	}
	// ClockLHS => OBJECTREF
	public Clock.LHS visitClockLHSObject(ClockLHSObjectContext ctx) {
		List<Clock> clocks = this.visitingState.getClocks();
		return clocks.get(clocks.size()-1).new LHS(ctx.OBJECTREF().getText());
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
		return ctx.OBJECTREF().getText();
	}
	
	// value => BOOL|REAL; to string
	public String visitValue(ValueContext ctx) {
		if (ctx.BOOL() != null)
			return ctx.BOOL().getText();
		return ctx.REAL().getText();
	}
	
}
