package com.learning.fiengClientInterface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "GREETRESTFULAPPLICATION")
public interface GreetFiegnClientInterface {

	@GetMapping("/greet")
	public String invokeGreetApi();
}
