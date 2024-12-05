package com.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GreetRestfulApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetRestfulApplication.class, args);
	}

}
