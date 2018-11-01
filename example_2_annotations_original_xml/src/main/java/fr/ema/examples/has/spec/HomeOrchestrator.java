package fr.ema.examples.has.spec;

public abstract class HomeOrchestrator {
	
	Light[] lights;
	Time clock;
	protected abstract void run();
	
}
