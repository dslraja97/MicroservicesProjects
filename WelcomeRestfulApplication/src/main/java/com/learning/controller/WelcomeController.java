package com.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.fiengClientInterface.GreetFiegnClientInterface;

@RestController
public class WelcomeController {

	@Autowired
	private GreetFiegnClientInterface clientInterface;

	@Autowired
	private Environment environement;

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		String port = environement.getProperty("server.port");
		String welcomeMsg = "Welcome to My Universe! (" + port + ")";
		String greet = clientInterface.invokeGreetApi();
		return welcomeMsg + " ," + greet;
	}
}
