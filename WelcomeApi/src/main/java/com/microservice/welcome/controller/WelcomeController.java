package com.microservice.welcome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservice.welcome.client.GreetFiegnClient;

@RestController
public class WelcomeController {
	
	@Autowired
	private GreetFiegnClient client;
	
	@GetMapping("/welcome")
	public String welcomeMessage() {
		
		//FOLLOWING IS THE HARDCODED INTERSERVICE COMMUNICATION
		/*
		 * RestTemplate template= new RestTemplate(); ResponseEntity<String> forEntity=
		 * template.getForEntity("http://localhost:8080/greet", String.class); String
		 * getResponse=forEntity.getBody();
		 */
		
		// FOLLOWING IS GENERAL Interservice Communication
		
		
		String greetResponse=client.involeGreetApi();
		
		return greetResponse+", welcome message";
	}

}
