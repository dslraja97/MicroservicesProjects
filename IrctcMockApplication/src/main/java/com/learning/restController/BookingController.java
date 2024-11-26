package com.learning.restController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.request.Passenger;
import com.learning.response.Ticket;

@RestController
public class BookingController {
	Map<Integer, Ticket> ticketMap = new HashMap<Integer, Ticket>();

	@PostMapping(value = "/book", consumes = { "application/json", "application/xml" }, produces = { "application/json",
			"application/xml" })
	public Ticket bookTicket(@RequestBody Passenger passenger) {

		System.out.println(passenger);
		Random random = new Random();
		int ticketId = random.nextInt();
		Ticket ticket = new Ticket();
		ticket.setDestination(passenger.getDestination());
		ticket.setPassangerName(passenger.getfName() + "" + passenger.getlName());
		ticket.setSource(passenger.getSource());
		ticket.setTicketCost("450");
		ticket.setTicketId(ticketId);
		ticket.setTicketStatus("Booked");
		ticket.setTrainNmber(passenger.getTrainNumber());
		ticketMap.put(ticketId, ticket);
		return ticket;
	}

	@GetMapping(value = "/book/{ticketId}", produces = { "application/json", "application/xml" })
	public Ticket getTicket(@PathVariable Integer ticketId) {
		return ticketMap.get(ticketId);

	}
}
