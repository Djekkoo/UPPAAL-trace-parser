package traceModel;

import java.util.HashMap;
import java.util.List;

// nothing more than a glorified dictionary, Java-style
public class State {

	protected Transition transition = null;
	protected String[] states = null;
	protected HashMap<String, String> variables = null;
	protected List<Clock> clocks = null;

	public Transition getTransition() {
		return transition;
	}

	public void setTransition(Transition transition) {
		this.transition = transition;
	}

	public String[] getStates() {
		return states;
	}

	public void setStates(String[] states) {
		this.states = states;
	}

	public HashMap<String, String> getVariables() {
		return variables;
	}

	public void setVariables(HashMap<String, String> variables) {
		this.variables = variables;
	}

	public List<Clock> getClocks() {
		return clocks;
	}

	public void setClocks(List<Clock> clocks) {
		this.clocks = clocks;
	}
	
}
