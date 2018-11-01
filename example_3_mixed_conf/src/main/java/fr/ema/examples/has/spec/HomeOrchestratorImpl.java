package fr.ema.examples.has.spec;

import fr.ema.examples.has.spec.Light.State;

public class HomeOrchestratorImpl extends HomeOrchestrator {
	
	public HomeOrchestratorImpl(Light[] lights, Time clock) {
		super();
		this.lights = lights;
		this.clock = clock;
	}
	public Light[] getLights() {
		return lights;
	}
	public void setLights(Light[] lights) {
		this.lights = lights;
	}
	public Time getClock() {
		return clock;
	}
	public void setClock(Time clock) {
		this.clock = clock;
	}
	@Override
	protected void run() {
		for (int i = 0; i < lights.length; i++) {
			lights[i].switchState(State.ON);
		}
	}
		
}
