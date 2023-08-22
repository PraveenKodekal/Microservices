package com.microservice.greet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	@GetMapping("/greet")
	public String greetMessage() {
		return "Greeting for the application";
	}

}
