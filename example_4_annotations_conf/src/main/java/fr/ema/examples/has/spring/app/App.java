package fr.ema.examples.has.spring.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import fr.ema.examples.has.spring.conf.BeansConfiguration;

/**
 * Main class to start the Spring Boot app
 */
@SpringBootApplication
@Configuration
@Import(BeansConfiguration.class)
public class App
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
}
