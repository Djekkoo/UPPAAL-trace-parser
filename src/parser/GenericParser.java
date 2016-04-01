package parser;

import java.util.ArrayList;

import parser.antlr4.TraceBaseVisitor;
import parser.antlr4.TraceParser.StateContext;
import parser.antlr4.TraceParser.TraceContext;
import parser.antlr4.TraceParser.TransitionContext;

public class GenericParser extends TraceBaseVisitor<Void> {

	
	public ArrayList<State> states = new ArrayList<State>();
	private State current = null; 
	
	
	// visit all states in trace
	public Void visitTrace(TraceContext ctx) {
		
		StateContext statectx;
		
		if (ctx.firstState() != null) {
			
			statectx = ctx.firstState().state();
			this.current = new State(statectx);
			this.states.add(this.current);
			this.visit(statectx);
			
		}
		
		for (int i = 0; i < ctx.gotoState().size(); i++) {

			statectx = ctx.gotoState(i).state();
			this.current = new State(statectx);
			this.states.add(this.current);
			this.visit(ctx.gotoState(i).transition());
			this.visit(statectx);
			
		}
		
		return null;
	}
	
	
	
}
