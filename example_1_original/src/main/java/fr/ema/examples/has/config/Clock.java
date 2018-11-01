package fr.ema.examples.has.config;

import fr.ema.examples.has.spec.Time;

public class Clock implements Time {

	@Override
	public void run() {
		System.out.println("tic-tac");
	}
}
	