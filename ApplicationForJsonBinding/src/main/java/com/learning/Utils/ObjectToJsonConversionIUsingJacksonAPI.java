package com.learning.Utils;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.learning.binding.Address;
import com.learning.binding.Consumers;

public class ObjectToJsonConversionIUsingJacksonAPI {

	public static void main(String[] args) throws Exception {
		Address address = new Address();
		address.setCity("Ulagam");
		address.setContry("Andam");
		address.setPinCode("000000");
		address.setState("Kailayam");
		address.setStreet("76B pillayiar Patti Street");
		Consumers consumers = new Consumers();
		consumers.setAge(27);
		consumers.setiSbpl(true);
		consumers.setName("Ganesha");
		consumers.setSalary(65000L);
		consumers.setSex("Male");
		consumers.setAddress(address);
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("Consumers.json"), consumers);

		System.out.println("Json Parsing Completed!");
	}

}
