package parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import parser.antlr4.*;
import parser.antlr4.TraceParser.*;
import traceModel.*;

public class GenericParser extends TraceBaseVisitor<Object> {

	
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
	
	// (systemStates; variables; clocks)
	@SuppressWarnings("unchecked")
	public Void visitState(StateContext ctx) {
		
		String[] states = (String[]) visit(ctx.systemStates());
		HashMap<String, String> variables = (HashMap<String, String>)visit(ctx.variables());
		Object clocks = visit(ctx.clocks()); // TODO: determine object-type and assign to class-property visitingstate
		
		// assign to current state
		this.visitingState.setStates(states);
		this.visitingState.setVariables(variables);
		return null;
	}
	
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
	
	// clocks => clock*?
	public Void visitClocks(ClocksContext ctx) {
		
		int length = ctx.clock().size();
		for (int i = 0; i < length; i++) {
			visit(ctx.clock(i)); //TODO: catch value and return back
		}

		return null;
	}
	
	// clock => (clockLHS; relation; REAL)
	public Void visitClock(ClockContext ctx) {
		return null; // TODO: this method
	}
	
	public Void visitClockLHS(ClockLHSContext ctx) {
		return null; // TODO: this method
	}
	 
	/************************** rules to strings *****************************/
	
	// multiple states to string array
	public String[] visitSystemStates(SystemStatesContext ctx) {
		int length = ctx.systemState().size();
		String[] states = new String[length ];
		for (int i = 0; i < length; i++)
			states[i] = (String) visit(ctx.systemState(i));
		
		return states;
	}
	
	// single state to string
	public String visitSystemState(SystemStateContext ctx) {
		return ctx.OBJECTREF().toString();
	}
	
	// value(bool|real) to string
	public String visitValue(ValueContext ctx) {
		if (ctx.BOOL() != null)
			return ctx.BOOL().toString();
		return ctx.REAL().toString();
	}
	
}
