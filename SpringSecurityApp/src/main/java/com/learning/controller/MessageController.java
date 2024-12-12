package com.learning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@GetMapping("/display")
	public String display() {
		return "Hello EveryOne Happy NewYear 2025!!";
	}

}
