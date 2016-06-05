package traceModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import parser.Pair;

public class StatesTransition implements Transition {
	
	private final List<StateTransition> transitions = new ArrayList<StateTransition>();
	
	public void addTransition(StateTransition transition) {
		this.transitions.add(transition);
	}
	
	public StateTransition getTransition(int i) {
		return this.transitions.get(i);
	}
	
	public List<StateTransition> getTransitions() {
		return transitions;
	}
	
	public int size() {
		return this.transitions.size();
	}
	
	public class StateTransition {
		private String stateA;
		private String stateB;
		private String guard; // this abstraction could be improved
		private Map<String, String> assignments;
		
		// Pair<Name, Bool> Bool == true -> outgoing synchronization; Bool == false -> ingoing synchronization
		private List<Pair<String, Boolean>> synchronization = null;
		
		public String getStateA() {
			return stateA;
		}
		public void setStateA(String stateA) {
			this.stateA = stateA;
		}
		public String getStateB() {
			return stateB;
		}
		public void setStateB(String stateB) {
			this.stateB = stateB;
		}
		public String getGuard() {
			return guard;
		}
		public void setGuard(String guard) {
			this.guard = guard;
		}
		public Map<String, String> getAssignments() {
			return assignments;
		}
		public void setAssignments(Map<String, String> assigns) {
			this.assignments = assigns;
		}
		public List<Pair<String, Boolean>> getSynchronization() {
			return synchronization;
		}
		public void setSynchronization(List<Pair<String, Boolean>> synchronization) {
			this.synchronization = synchronization;
		}
	}
	
}
