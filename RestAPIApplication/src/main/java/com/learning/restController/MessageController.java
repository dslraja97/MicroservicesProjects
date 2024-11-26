package com.learning.restController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	public MessageController() {
		System.out.println("MessageController Constructor!!");
	}

	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcome() {
		String message = "Welcome to my First restAPI.";
		return new ResponseEntity<>(message, HttpStatus.OK);
	}

	@GetMapping("/greet")
	public String greeting() {
		String message = "Good Evening Guys!!";
		return message;
	}

}
