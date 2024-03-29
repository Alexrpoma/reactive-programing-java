package com.example.ractiveprograming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReactiveProgramingApplication {
	public static void main(String[] args) {
		SpringApplication.run(ReactiveProgramingApplication.class, args);
		ReactorMono.run();
		ReactorFlux.run();
	}
}
