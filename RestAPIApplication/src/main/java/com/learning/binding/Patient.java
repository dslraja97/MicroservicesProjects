package com.learning.binding;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Patient {

	private String name;
	private String gender;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}

}
