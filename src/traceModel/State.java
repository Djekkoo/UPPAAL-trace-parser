package traceModel;

import java.util.HashMap;

// nothing more than a glorified dictionary, Java-style
public class State {

	protected Transition transition = null;
	protected String[] States = null;
	protected HashMap<String, String> variables = null;

	public Transition getTransition() {
		return transition;
	}

	public void setTransition(Transition transition) {
		this.transition = transition;
	}

	public String[] getStates() {
		return States;
	}

	public void setStates(String[] states) {
		States = states;
	}

	public HashMap<String, String> getVariables() {
		return variables;
	}

	public void setVariables(HashMap<String, String> variables) {
		this.variables = variables;
	}
	
}
