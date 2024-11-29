package com.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.learning.service.TicketInfoService;

@SpringBootApplication
public class AsyncCommunicationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AsyncCommunicationApplication.class, args);
		TicketInfoService bean = context.getBean(TicketInfoService.class);
		bean.getTicketInfoSync("-229694895");
		bean.getTicketInfoAsync("-411364011");

	}

}
