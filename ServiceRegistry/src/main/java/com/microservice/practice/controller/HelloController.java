package com.microservice.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	//@GetMapping("/hi")
	public String getMessage(String message) {
		message="HI this message Controller";
		return message;
	}

}
