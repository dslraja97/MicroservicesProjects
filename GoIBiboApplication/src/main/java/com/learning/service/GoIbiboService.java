package com.learning.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.learning.request.Passenger;
import com.learning.response.Ticket;

@Service
public class GoIbiboService {

	@Value("${IRCTC.ENDPOINT.BOOK_TICKET}")
	private String IRCTC_ENDPOINT_URL;

	@Value("${IRCTC.ENDPOINT.GET_TICKET}")
	private String IRCTC_GET_TICKET_ENDPOINT_URL;

	public Ticket processTicketBooking(Passenger request) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Ticket> postForEntity = restTemplate.postForEntity(IRCTC_ENDPOINT_URL, request, Ticket.class);
		HttpStatusCode httpStatusCode = postForEntity.getStatusCode();
		if (httpStatusCode.is2xxSuccessful()) {
			Ticket ticket = postForEntity.getBody();
			return ticket;
		} else {
			return null;
		}
	}

	public Ticket searchTicket(String ticketId) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Ticket> responseEntity = restTemplate.getForEntity(IRCTC_GET_TICKET_ENDPOINT_URL, Ticket.class, ticketId);
		HttpStatusCode statusCode = responseEntity.getStatusCode();
		if (statusCode.is2xxSuccessful()) {
			Ticket ticket = responseEntity.getBody();
			return ticket;
		} else {
			return null;
		}

	}

}
