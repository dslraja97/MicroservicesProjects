package com.learning.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping(value = "/admin")
	public String admin() {
		return "Logged In as Admin!";
	}

	@GetMapping(value = "/user")
	public String user() {
		return "Logged in as User!";
	}

	@GetMapping(value = "/")
	public String welcole() {
		return "Welcome To greate Karikalan Magic Show!";
	}
}
