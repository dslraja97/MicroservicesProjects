package com.learning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageController {

	@GetMapping("/welcome")
	@ResponseBody
	public String displayWelcome() {
		String message = "Welcome to My Website!!";
		int result = 2 / 0;
		return message;
	}

	@GetMapping("/greeting")
	@ResponseBody
	public String greet() {
		String message = "GoodEvening!!";
		return message;
	}

}
