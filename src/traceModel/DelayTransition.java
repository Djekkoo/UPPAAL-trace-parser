package traceModel;

public class DelayTransition implements Transition{
	private float delay;
	
	public DelayTransition(float delayTime) {
		this.delay = delayTime;
	}

	public float getDelay() {
		return delay;
	}

	public void setDelay(float delay) {
		this.delay = delay;
	}
}
