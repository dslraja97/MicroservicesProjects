package com.learning.response;

import lombok.Data;

@Data
public class Ticket {
	private String destination;
	private String passangerName;
	private String source;
	private String ticketCost;
	private Integer ticketId;
	private String ticketStatus;
	private String trainNmber;

}
