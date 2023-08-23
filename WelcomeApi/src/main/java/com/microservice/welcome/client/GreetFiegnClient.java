package com.microservice.welcome.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
@FunctionalInterface
@FeignClient(name="greet-api")
public interface GreetFiegnClient {
	
	@GetMapping("/greet")
	public String involeGreetApi();

}
