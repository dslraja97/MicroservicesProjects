package com.learning.response;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Ticket {
	private Integer ticketId;
	private String source;
	private String destination;
	private String trainNmber;
	private String ticketCost;
	private String ticketStatus;
	private String passangerName;

	@XmlElement
	public Integer getTicketId() {
		return ticketId;
	}

	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}

	@XmlElement
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@XmlElement
	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@XmlElement
	public String getTrainNmber() {
		return trainNmber;
	}

	public void setTrainNmber(String trainNmber) {
		this.trainNmber = trainNmber;
	}

	@XmlElement
	public String getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(String ticketCost) {
		this.ticketCost = ticketCost;
	}

	@XmlElement
	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	@XmlElement
	public String getPassangerName() {
		return passangerName;
	}

	public void setPassangerName(String passangerName) {
		this.passangerName = passangerName;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", source=" + source + ", destination=" + destination + ", trainNmber="
				+ trainNmber + ", ticketCost=" + ticketCost + ", ticketStatus=" + ticketStatus + ", passangerName="
				+ passangerName + "]";
	}

}
