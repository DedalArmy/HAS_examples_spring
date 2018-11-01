package fr.ema.examples.has.spring.conf;

import fr.ema.examples.has.config.AdjustableLamp;
import fr.ema.examples.has.config.Clock;
import fr.ema.examples.has.config.Orchestrator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("fr.ema.examples.has.*")
@Configuration
public class BeansConfiguration {
	
    @Bean(name="adjustableLampBathroom")
    public AdjustableLamp lampBeanConfiguration1() {
        return new AdjustableLamp();
    }
    
    @Bean(name="clockBedroom")
    public Clock clockConfiguration() {
        return new Clock();
    }
}
