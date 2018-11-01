package fr.ema.examples.has.spec;

public abstract class Light{
	
	public static enum State {ON, OFF};
	protected State state;
	
	public abstract void switchState(State s);
	
}
