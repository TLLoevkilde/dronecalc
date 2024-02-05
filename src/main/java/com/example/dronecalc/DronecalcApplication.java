package com.example.dronecalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DronecalcApplication {

	private static int result;

	public static void main(String[] args) {
		SpringApplication.run(DronecalcApplication.class, args);
		Calculator calculator = new Calculator();

        result = calculator.add(5, 7);
        System.out.println("The result is: " + result);
	}

}
