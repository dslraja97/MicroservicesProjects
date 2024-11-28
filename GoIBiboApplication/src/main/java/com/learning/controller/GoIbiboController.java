package com.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learning.request.Passenger;
import com.learning.response.Ticket;
import com.learning.service.GoIbiboService;

@Controller
public class GoIbiboController {

	@Autowired
	private GoIbiboService goIbiboService;

	@GetMapping("/")
	public String display() {
		return "index";
	}

	@GetMapping("/search")
	public String search() {
		return "search";
	}

	@GetMapping("/searchTicket")
	public String searchTicket(@RequestParam("ticketId") String ticketId, Model model) {
		System.out.println("Ticket Id : " + ticketId);
		Ticket searchTicket = goIbiboService.searchTicket(ticketId);
		System.out.println("Search Ticket : " + searchTicket);
		model.addAttribute("ticket", searchTicket);
		return "search";
	}

	@PostMapping("/bookTicket")
	public String bookTicket(Passenger passenger, Model model) {
		System.out.println("GOIBIBO:" + passenger);
		Ticket processTicketBooking = goIbiboService.processTicketBooking(passenger);
		System.out.println("GOIBIBO:" + processTicketBooking);
		model.addAttribute("ticket", processTicketBooking);
		return "success";
	}

}
