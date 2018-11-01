package fr.ema.examples.has.config;

import org.springframework.stereotype.Component;

import fr.ema.examples.has.spec.Time;

@Component
public class Clock implements Time {

	@Override
	public void run() {
		System.out.println("tic-tac");
	}
}
	