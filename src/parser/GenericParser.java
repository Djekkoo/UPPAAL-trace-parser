package parser;

import java.util.ArrayList;
import java.util.List;

import parser.antlr4.TraceBaseVisitor;
import parser.antlr4.TraceParser.StateContext;
import parser.antlr4.TraceParser.SystemStateContext;
import parser.antlr4.TraceParser.TraceContext;
import parser.antlr4.TraceParser.TransitionDelayContext;
import parser.antlr4.TraceParser.TransitionDetailsContext;
import parser.antlr4.TraceParser.TransitionStateContext;
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
			Object syncs = null;
			if (transitions.get(i).synchronization() != null)
				syncs = this.visit(transitions.get(i).synchronization());
			
			// libutap OR verifyta
			if (transitions.get(i).transitionAssignmentsLibutap() != null) {
				// TODO:  travers child
			} else {
				// TODO:  travers child
			}
			
			
		}
		
		return trans;
	}

	// time (+X)
	public Transition visitTransitionDelay(TransitionDelayContext ctx) {
		float delayTime = Float.parseFloat(ctx.REAL().toString());
		return new DelayTransition(delayTime);
	}
	
	// (systemStates; variables; clocks)
	public Void visitState(StateContext ctx) {
		
		//TODO: visit childs and apply on this.visitingState
		
		return null;
	}
	 
	/** rules to strings */
	public String visitSystemState(SystemStateContext ctx) {
		return ctx.OBJECTREF().toString();
	}
	
	
}
