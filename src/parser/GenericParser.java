package parser;

import java.util.ArrayList;

import parser.antlr4.TraceBaseVisitor;
import parser.antlr4.TraceParser.StateContext;
import parser.antlr4.TraceParser.TraceContext;
import parser.antlr4.TraceParser.TransitionDelayContext;
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

	// stateX -> stateY (guard; sync; assignments)
	public Transition visitTransitionState(TransitionStateContext ctx) {
		StateTransition trans = new StateTransition();
		// TODO visit childs and apply on trans
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
	
	
	
}
