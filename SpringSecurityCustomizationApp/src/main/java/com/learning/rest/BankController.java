package com.learning.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

	@GetMapping("/loginpage")
	public String login() {
		return "Login Success";
	}

	@GetMapping("/contact")
	public String contact() {
		return "Please reach out us with www.burmado.com";
	}

	@GetMapping("/balance")
	public String balance() {
		return "Your Account balance is $123456";
	}

	@GetMapping("/transfer")
	public String transfer() {
		return "Transfer of rupuees $10 is Success";
	}

}
