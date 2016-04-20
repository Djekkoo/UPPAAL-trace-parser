package traceModel;

import java.util.HashMap;
import java.util.List;

// nothing more than a glorified dictionary, Java-style
public class State {

	private Transition transition = null;
	private String[] states = null;
	private HashMap<String, String> variables = null;
	private List<Clock> clocks = null;
	private float globalTime;

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

	public void setGlobalTime(float globalTime) {
		this.globalTime = globalTime;
	}
	
	public float getGlobalTime() {
		return this.globalTime;
	}
	
}
