package com.learning.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class TicketInfoService {

	@Value("${irctc.getTicket.url}")
	private String IrctcGetTicketURL;

	public void getTicketInfoSync(String ticketId) {
		System.out.println("Sync Methoud Started!");
		WebClient client = WebClient.create();
		String response = client.get().uri(IrctcGetTicketURL, ticketId).accept(MediaType.APPLICATION_JSON).retrieve()
				.bodyToMono(String.class).block();
		System.out.println("Response : " + response);
		System.out.println("Sync Methoud Ended!");
	}

	public void getTicketInfoAsync(String ticketId) {
		System.out.println("Async Methoud Started!!");
		WebClient client = WebClient.create();
		client.get().uri(IrctcGetTicketURL, ticketId).accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(String.class)
				.subscribe(response -> handleResponse(response));
		System.out.println("Async Methoud Ended!!");
	}

	private void handleResponse(String response) {
		System.out.println(response);

	}
}
