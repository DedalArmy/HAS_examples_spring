package fr.ema.examples.has.config;

import fr.ema.examples.has.spec.Light;

public class AdjustableLamp extends Light{

	int intensity;
	
	@Override
	public void switchState(State s) {
		state = s;		
	}
	public void adjustIntensity(int value) {
		intensity = value;		
	}


}
