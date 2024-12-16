package com.learning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping("/name")
	public String dislayName() {
		String name = "My Name is Logan DineshLogan!!";

		String n = null;
		n.length();
		return name;

	}
}
