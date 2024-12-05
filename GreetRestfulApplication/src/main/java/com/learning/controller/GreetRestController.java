package com.learning.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {

	@GetMapping("/greet")
	public String greet() {
		if (LocalDateTime.now().getHour() <= 12) {
			return "Good Morning!";
		} else if (LocalDateTime.now().getHour() >= 12) {
			return "Good Afternoon!!";
		} else {
			return "Good Night Sweet Dreams!!!";
		}
	}

}
