package com.learning.request;

public class Passenger {
	private String fName;
	private String lName;
	private String source;
	private String destination;
	private String doj;
	private String trainNumber;

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}

	@Override
	public String toString() {
		return "Passenger [fName=" + fName + ", lName=" + lName + ", source=" + source + ", destination=" + destination + ", doj="
				+ doj + ", trainNumber=" + trainNumber + "]";
	}

}
