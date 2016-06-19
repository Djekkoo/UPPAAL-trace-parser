package parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import intermediateTrace.transitions.AbstractTransition;
import intermediateTrace.transitions.DelayTransition;
import intermediateTrace.transitions.EdgeTransition;
import intermediateTrace.value.Value;
import intermediateTrace.LocationInstance;
import intermediateTrace.State;
import intermediateTrace.TemplateInstance;
import intermediateTrace.Trace;
import intermediateTrace.Valuation;
import intermediateTrace.clocks.AbstractClockBoundary;
import intermediateTrace.clocks.CombinedClockBoundary;
import intermediateTrace.clocks.InverseClockBoundary;
import intermediateTrace.clocks.Relation;
import intermediateTrace.clocks.SingleClockBoundary;
import parser.antlr4.*;
import parser.antlr4.UPPAALTraceParser.*;

/** A note from the author:
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
	
	private final ArrayList<State> states = new ArrayList<State>();
	private final ArrayList<AbstractTransition> transitions = new ArrayList<AbstractTransition>();
	//private State visitingState = null;
	
	// a property that should be deduced on as many ways as possible
	// currently only based on DelayTransactions
	// the value of this variable is applied to all states on their construction, and accumulates during parsing.
	private float globalTime = 0;
	//private NTA uppaal;
	private MetaFactory metaFactory; 
	//private List<TemplateInstance> sampleTemplates = new ArrayList<TemplateInstance>();
	//private List<TemplateInstance> usedTemplates = new ArrayList<TemplateInstance>();
	
	public GenericParser() {
		this.metaFactory = new MetaFactory();
	}
	public Trace buildTrace() {
		return this.metaFactory.createTrace(this.states, this.transitions);
	}
	
	// use this method when the parsing has been cut into different batches
	public void setGlobalTime(float globalTime) {
		this.globalTime = globalTime;
	}
	// use this method when the parsing has been cut into different batches
	public float getGlobaltime() {
		return this.globalTime;
	}
	
	// visit all states in trace
	public Void visitTrace(TraceContext ctx) {
		
		StateContext statectx;
		
		if (ctx.firstState() != null) {
			
			statectx = ctx.firstState().state();
			
			State newState = (State)this.visit(statectx);
			this.states.add(newState);
			
		}
		
		for (int i = 0; i < ctx.gotoState().size(); i++) {

			// visit state
			statectx = ctx.gotoState(i).state();
			this.states.add((State)this.visit(statectx));
			
			// add transition
			AbstractTransition newTrans = (AbstractTransition) this.visit(ctx.gotoState(i).transition());
			this.transitions .add(newTrans);
			
			// time delay? Adjust global time
			if (newTrans instanceof DelayTransition) {
				this.globalTime += ((DelayTransition) newTrans).getDelay();
				this.states.get(this.states.size()-1).setTime(this.globalTime);
			}
			
			this.states.get(this.states.size()-1).setTransitionFrom(newTrans);
			this.states.get(this.states.size()-2).setTransitionTo(newTrans);
			
			
		}
		
		return null;
	}
	/**----------------------------------TRANSITIONS-------------------------------**/
	// (stateA -> stateB \(guard; sync?; assignments\)) *
	@SuppressWarnings({ "unchecked", "unused" }) //sorry
	public EdgeTransition visitTransitionState(TransitionStateContext ctx) {
		
		List<String> edgeList = new ArrayList<String>();
		
		List<TransitionDetailsContext> transitionDetails = ctx.transitionDetails();
		for (int i = 0; i < transitionDetails.size(); i++) {
			// generate new sub transition and apply to list
			edgeList.add(transitionDetails.get(i).getText());
			
		}
		return this.metaFactory.createEdgeTransition(this.states.get(this.states.size()-2), this.states.get(this.states.size()-1), MetaFactory.fromListToArray(edgeList, new String[edgeList.size()]));
	}

	// time (+REAL)
	public DelayTransition visitTransitionDelay(TransitionDelayContext ctx) {
		float delayTime = Float.parseFloat(ctx.REAL().getText());
		return this.metaFactory.createDelayTransition(this.states.get(this.states.size()-2), this.states.get(this.states.size()-1), delayTime);
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
				String value = null;
				if (ctx.assignments().assignment(i).value() != null) {
					value = (String) visit(ctx.assignments().assignment(i).value());
				}
				else if (ctx.assignments().assignment(i).expr() != null) {
					value = ctx.assignments().assignment(i).expr().getText();
				} else {
					System.out.println("Could not determine value of assignment: " + ctx.assignments().assignment(i).OBJECTREF().getText() + " - in method GenericParser:visitTransitionsAssignment");
				}
				assignments.put(ctx.assignments().assignment(i).OBJECTREF().getText(), value);
			
			}
			for(int i = 0; i < ctx.assignments().funcAssignment().size(); i++) {
				assignments.put((String) visit(ctx.assignments().funcAssignment(i)), null);
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
	public State visitState(StateContext ctx) {
		

		String[] states = (String[]) visit(ctx.systemStates());
		List<Valuation> tmp = (List<Valuation>)visit(ctx.variables());
		Valuation[] valuations = MetaFactory.fromListToArray(tmp);
		TemplateInstance[] stateTemplates = new TemplateInstance[states.length];
		LocationInstance[] stateLocations = new LocationInstance[states.length];
		

		// match all locations (& create new instances of template, if necessary)
		for (int i = 0; i < states.length; i++) {
			String[] stateParts = states[i].split("\\.", 2);
			stateTemplates[i] = this.metaFactory.createNamedTemplateInstance(stateParts[0].split("\\(")[0], stateParts[0]);
			stateLocations[i] = this.metaFactory.createLocationInstance(stateParts[1]);
			stateLocations[i].setTemplate(stateTemplates[i]);
		}

		// visit and save clocks
		AbstractClockBoundary[] clocks = (AbstractClockBoundary[])visit(ctx.clocks());
		return this.metaFactory.createState(stateTemplates, stateLocations, clocks, valuations, this.globalTime);
	}
	/**----------------------------------VARIABLES----------------------------------**/
	// get all variable values in hashmap 
	public List<Valuation> visitVariables(VariablesContext ctx) {
		List<Valuation> variables = new ArrayList<Valuation>();
		
		// loop over variables and assign value
		int length = ctx.variable().size();
		for (int i = 0; i < length; i++) {
			Valuation val = (Valuation) this.visit(ctx.variable(i));
			if (val == null) {
				System.out.println("invalid implementation for " + ctx.variable(i).getText());
			} else {
				variables.add(val);
			}
		}
		
		return variables;
	}
	// variable => OBJECTREF EQ value
	public Valuation visitVariable(VariableContext ctx) {
		String object = ctx.OBJECTREF().getText();
		Value resVal  = null;
		ValueContext value = ctx.value(); // value => BOOL | REAL
		if (value.BOOL() != null ){
			resVal = this.metaFactory.createBoolValue(value.BOOL().getText().toLowerCase().equals("true"));
		}
		else if (value.REAL() != null) {
			if (value.REAL().getText().contains(".")) { // clockvalue
				resVal = this.metaFactory.createClockValue(Float.parseFloat(value.getText()));
			} else {
				resVal = this.metaFactory.createIntValue(Integer.parseInt(value.getText()));
			}
		} else {
			throw new RuntimeException("Variable with unknown value, please add to GenericParser.java:visitVariable."); 
		}
		
		return this.metaFactory.createValuation(object, resVal);
	}
	
	/**----------------------------------CLOCKS -----------------------------------**/
	// clocks => clock*?
	public AbstractClockBoundary[] visitClocks(ClocksContext ctx) {
		int length = ctx.clock().size();
		AbstractClockBoundary[] res = new AbstractClockBoundary[length];
		for (int i = 0; i < length; i++) {
			// visitClock(ClockContext) appends itself to the currently visiting state,
			// so there is no need to handle result values
			res[i] = (AbstractClockBoundary) visit(ctx.clock(i));
		}

		return res;
	}
	
	// clock => (clockLHS; relation; REAL)
	public AbstractClockBoundary visitClock(ClockContext ctx) {
	
		AbstractClockBoundary clock = (AbstractClockBoundary) visit(ctx.clockLHS());
		
		// defer relation and value
		String rel = ctx.relation().getText();
		Relation relation = null;
		switch(rel) {
		case "=": 
			// this should not occur, but got it covered anyways
		case "==":
			relation = Relation.EQ;
			break;
		case "!=":
			relation = Relation.NE;
			break;
		case "<":
			relation = Relation.LT;
			break;
		case "<=": // in all seen examples, this is the only relation witnessed
			relation = Relation.LE;
			break;
		case ">":
			relation = Relation.GT;
			break;
		case ">=":
			relation = Relation.GE;
			break;
		default: // its not ok
			throw new RuntimeException("Unregistered operant: " + ctx.relation().getText() + ", please add to grammar rule 'relation' and apply in traceModel.Clock.Relation.");
		}
		
		float value = Float.valueOf(ctx.REAL().getText());
		
		clock.setRelation(relation);
		clock.setValue(value);
		
		return clock;
	}
	
	// visitClockLHS(ClockLHSContext ctx) is implemented through the following 4 methods
	// ClockLHS => T(0) - OBJECTREF
	public InverseClockBoundary visitClockLHSZeroMinusObject(ClockLHSZeroMinusObjectContext ctx) {
		String clock = ctx.OBJECTREF().getText(); 
		return this.metaFactory.createInverseClockBoundary(clock);
	}
	// ClockLHS => OBJECTREF - T(0)
	public SingleClockBoundary visitClockLHSObjectMinusZero(ClockLHSObjectMinusZeroContext ctx) {
		String clock = ctx.OBJECTREF().getText(); 
		return this.metaFactory.createSingleClockBoundary(clock);
	}
	// ClockLHS => OBJECTREF
	public SingleClockBoundary visitClockLHSObject(ClockLHSObjectContext ctx) {
		String clock = ctx.OBJECTREF().getText(); 
		return this.metaFactory.createSingleClockBoundary(clock);
	}
	 
	// ClockLHS => OBJECTREF - OBJECTREF
	public CombinedClockBoundary visitClockLHSObjectMinusObject(ClockLHSObjectMinusObjectContext ctx) {
		String minuend = ctx.OBJECTREF(0).getText(); 
		String substrahend = ctx.OBJECTREF(1).getText(); 
		return this.metaFactory.createCombinedClockBoundary(minuend, substrahend);
	}
	/**----------------------------------RULES TO STRINGS------------------------------**/
	
	public String visitFuncAssignment(FuncAssignmentContext ctx) {
		return ctx.getText();
	}
	
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
