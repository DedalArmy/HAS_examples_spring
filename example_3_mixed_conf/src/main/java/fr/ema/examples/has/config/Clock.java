package fr.ema.examples.has.config;

import fr.ema.examples.has.spec.Time;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Clock implements Time {

	@Override
	public void run() {
		System.out.println("tic-tac");
	}
}
	