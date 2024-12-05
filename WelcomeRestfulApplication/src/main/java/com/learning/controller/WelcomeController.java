package com.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.fiengClientInterface.GreetFiegnClientInterface;

@RestController
public class WelcomeController {

	@Autowired
	private GreetFiegnClientInterface clientInterface;

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		String welcomeMsg = "Welcome to My Universe!";
		String greet = clientInterface.invokeGreetApi();
		return welcomeMsg + " ," + greet;
	}
}
