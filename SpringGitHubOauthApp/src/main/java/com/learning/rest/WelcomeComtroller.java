package com.learning.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeComtroller {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to great Sivuni Aana";
	}
}
