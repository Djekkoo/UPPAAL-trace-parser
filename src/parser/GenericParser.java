package parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import myTrace.transitions.AbstractTransition;
import myTrace.transitions.DelayTransition;
import myTrace.transitions.EdgeTransition;
import myTrace.clocks.AbstractClockBoundary;
import myTrace.clocks.CombinedClockBoundary;
import myTrace.clocks.InverseClockBoundary;
import myTrace.clocks.Relation;
import myTrace.clocks.SingleClockBoundary;
import parser.antlr4.*;
import parser.antlr4.UPPAALTraceParser.*;
import uppaal.NTA;
import uppaal.declarations.ClockVariableDeclaration;
import uppaal.declarations.system.InstantiationList;
import uppaal.templates.AbstractTemplate;
import uppaal.templates.Edge;
import myTrace.*;

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
	
	public final ArrayList<myTrace.State> states = new ArrayList<State>();
	//private State visitingState = null;
	
	// a property that should be deduced on as many ways as possible
	// currently only based on DelayTransactions
	// the value of this variable is applied to all states on their construction, and accumulates during parsing.
	private float globalTime = 0;
	private NTA uppaal;
	private MetaFactory metaFactory; 
	private List<TemplateInstance> sampleTemplates = new ArrayList<TemplateInstance>();
	private List<TemplateInstance> usedTemplates = new ArrayList<TemplateInstance>();
	
	public GenericParser(NTA uppaal2) {
		this.uppaal = uppaal2;
		this.metaFactory = new MetaFactory();
		
		// load templates+locations from uppaal model
		EList<InstantiationList> instList = this.uppaal.getSystemDeclarations().getSystem().getInstantiationList();
		
		// generate sample-templates from this load
		for (int i = 0; i < instList.size(); i++) {
			EList<AbstractTemplate> temp = instList.get(i).getTemplate();
			for (int j = 0; j < temp.size(); j++) {
				this.sampleTemplates.add(this.metaFactory.createTemplateInstance(temp.get(j)));
			}
		}
		
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
	public Trace visitTrace(TraceContext ctx) {
		
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
			
			// time delay? Adjust global time
			if (newTrans instanceof DelayTransition) {
				this.globalTime += ((DelayTransition) newTrans).getDelay();
			}
			
		}
		
		return this.metaFactory.createTrace(this.states, this.uppaal);
	}
	/**----------------------------------TRANSITIONS-------------------------------**/
	// (stateA -> stateB \(guard; sync?; assignments\)) *
	@SuppressWarnings({ "unchecked", "unused" }) //sorry
	public EdgeTransition visitTransitionState(TransitionStateContext ctx) {
		
		List<Edge> edgeList = new ArrayList<Edge>();
		
		List<TransitionDetailsContext> transitionDetails = ctx.transitionDetails();
		for (int i = 0; i < transitionDetails.size(); i++) {
			// generate new sub transition and apply to list
			
			// states & guard
			String stateA = (String) this.visit(transitionDetails.get(i).systemState(0));
			String stateB = (String) this.visit(transitionDetails.get(i).systemState(1));
			String guard  = (String) this.visit(transitionDetails.get(i).transitionGuard());
			
			// sync optional
			List<Pair<String, Boolean>> syncs = null;
			if (transitionDetails.get(i).synchronization() != null)
				syncs = (List<Pair<String, Boolean>>) this.visit(transitionDetails.get(i).synchronization());
			
			
			// assignments
			Map<String, String> assignments = (Map<String, String>) visit(transitionDetails.get(i).transitionAssignments());
			
			String templateName = stateA.split("/\\./")[0];
			String locationFrom = stateA.split("/\\./", 2)[1];
			String locationTo = stateB.split("/\\./", 2)[1];
			int j;
			// Find Edge and add to 'edgeList'
			thisIsBadPractice: for (j = 0; j < this.usedTemplates.size(); j++) {
				if (this.usedTemplates.get(j).getName().equals(templateName)) {
					List<Edge> possibleEdges = this.usedTemplates.get(j).getTemplate().getEdge();
					for (int edgeIterator = 0; edgeIterator < possibleEdges.size(); edgeIterator++) {
						// target/destination name matching?
						if (possibleEdges.get(edgeIterator).getSource().getName().equals(locationFrom) && 
								possibleEdges.get(edgeIterator).getTarget().getName().equals(locationTo)) {
							// this is an edge with the specified target and source attributes, 
							// if it is not unique it might prove usefull to check additional parameters, 
							// such as guard, assignment and synchronization effects.
							// however, for this prototype, we will assume it is unique
							// TODO: verify answer checking other parameters
							edgeList.add(possibleEdges.get(edgeIterator));
							break thisIsBadPractice;
						}
					}
				}
			}
			// means that we did not find the correct template and/or matching edges
			if (j == this.usedTemplates.size()) {
				throw new RuntimeException("Could not find matching edge, please provide the correct model.");
			}
			
		}
		
		return this.metaFactory.createEdgeTransition(this.states.get(this.states.size()-2), this.states.get(this.states.size()-1), (Edge[])edgeList.toArray());
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
				assignments.put(ctx.assignments().assignment(i).OBJECTREF().getText(), (String) visit(ctx.assignments().assignment(i).value()));
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
		Valuation[] valuations = (Valuation[]) ((List<Valuation>)visit(ctx.variables())).toArray();
		TemplateInstance[] stateTemplates = new TemplateInstance[states.length];
		LocationInstance[] stateLocations = new LocationInstance[states.length];
		
		
		// match all locations (& create new instances of template, if necessary)
		for (int i = 0; i < states.length; i++) {
			String[] stateParts = states[i].split("/\\./", 2);

			// do we know this template?
			for (int j = 0; j < this.usedTemplates.size(); j++) {
				if (this.usedTemplates.get(j).getName().equals(stateParts[1])) {
					stateTemplates[i] = this.usedTemplates.get(j);
				}
			}
			// No we don't, can we learn it? 
			if (stateTemplates[i] == null) {
				String lookforName = stateParts[0];
				if (lookforName.contains("(")) {//parameterized template? (door(1).location)
					lookforName = lookforName.split("/\\(/")[0];
				}
				for (int j = 0; j < this.sampleTemplates.size(); j++) {
					if (this.sampleTemplates.get(j).getName().equals(lookforName)) { // Yes, we can!
						stateTemplates[i] = this.metaFactory.createdNamedTemplateIntance(this.sampleTemplates.get(j), states[i]);
						this.usedTemplates.add(stateTemplates[i]);
					}
				}
			}
			// No, we couldn't!
			if (stateTemplates[i] == null)
				throw new RuntimeException("Cannot find a template matching location: " + states[i] + ", please provide the correct model");
			
			
			// find matching location
			for (int j = 0; j < stateTemplates[i].getLocations().size(); j++) {
				if (stateTemplates[i].getLocations().get(j).getLocation().getName().equals(stateParts[1])) { // found a matching location
					stateLocations[i] = stateTemplates[i].getLocations().get(j);
				}
			}
			// couldn't find it
			if (stateLocations[i] == null)
				throw new RuntimeException("Cannot find a location matching: " + states[i] + ", please provide the correct model");
			
		}

		// visit and save clocks
		AbstractClockBoundary[] clocks = (AbstractClockBoundary[])visit(ctx.clocks()); 
		
		// create state
		return this.metaFactory.createState(stateTemplates, stateLocations, clocks, valuations, this.globalTime);
	}
	/**----------------------------------VARIABLES----------------------------------**/
	// get all variable values in hashmap 
	public List<Valuation> visitVariables(VariablesContext ctx) {
		List<Valuation> variables = new ArrayList<Valuation>();
		
		// loop over variables and assign value
		int length = ctx.variable().size();
		for (int i = 0; i < length; i++) {
			variables.add((Valuation) this.visit(ctx.variable(i)));
		}
		
		return variables;
	}
	// variable => OBJECTREF EQ value
	public Valuation visitVariable(VariableContext ctx) {
		String object = ctx.OBJECTREF().getText();
		Object value  = ctx.value().getText();
		
		return this.metaFactory.createValuation(object, null);
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
		ClockVariableDeclaration clock = null; // TODO: Find me
		return this.metaFactory.createInverseClockBoundary(clock);
	}
	// ClockLHS => OBJECTREF - T(0)
	public SingleClockBoundary visitClockLHSObjectMinusZero(ClockLHSObjectMinusZeroContext ctx) {
		ClockVariableDeclaration clock = null; // TODO: Find me
		return this.metaFactory.createSingleClockBoundary(clock);
	}
	// ClockLHS => OBJECTREF
	public SingleClockBoundary visitClockLHSObject(ClockLHSObjectContext ctx) {
		ClockVariableDeclaration clock = null; // TODO: Find me
		return this.metaFactory.createSingleClockBoundary(clock);
	}
	 
	// ClockLHS => OBJECTREF - OBJECTREF
	public CombinedClockBoundary visitClockLHSObjectMinusObject(ClockLHSObjectMinusObjectContext ctx) {
		ClockVariableDeclaration minuend = null; // TODO: Find me
		ClockVariableDeclaration substrahend = null; // TODO: Find me
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
