package com.learning.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {

	// environment property
	@Autowired
	private Environment environment;

	@GetMapping("/greet")
	public String greet() {
		String port = environment.getProperty("server.port");
		if (LocalDateTime.now().getHour() <= 12) {
			return "Good Morning!" + "(" + port + ")";
		} else if (LocalDateTime.now().getHour() >= 12) {
			return "Good Afternoon!!" + "(" + port + ")";
		} else {
			return "Good Night Sweet Dreams!!!" + "(" + port + ")";
		}
	}

}
