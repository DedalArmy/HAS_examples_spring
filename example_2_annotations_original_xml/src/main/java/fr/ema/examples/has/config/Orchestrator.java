package fr.ema.examples.has.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.ema.examples.has.spec.HomeOrchestratorImpl;

@Component
public class Orchestrator extends HomeOrchestratorImpl {
	@Autowired
	public Orchestrator(AdjustableLamp[] lights, Clock clock) {
		super(lights, clock);
		// TODO Auto-generated constructor stub
	}
}
