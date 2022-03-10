package com.example.WebServiceRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class WebServiceRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebServiceRestApplication.class, args);
	}

}
