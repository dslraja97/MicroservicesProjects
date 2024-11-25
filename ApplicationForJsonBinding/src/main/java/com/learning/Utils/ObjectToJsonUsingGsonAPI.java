package com.learning.Utils;

import com.google.gson.Gson;
import com.learning.binding.Address;
import com.learning.binding.Consumers;

public class ObjectToJsonUsingGsonAPI {

	public static void main(String[] args) {
		Address address = new Address();
		address.setCity("Ulagam");
		address.setContry("Andam");
		address.setPinCode("656565");
		address.setState("Kalaiyam");
		address.setStreet("76B T K Nambi Street");
		Consumers consumers = new Consumers();
		consumers.setAddress(address);
		consumers.setAge(27);
		consumers.setiSbpl(true);
		consumers.setName("Vinayagan");
		consumers.setSalary(23456L);
		consumers.setSex("Male");
		Gson gson = new Gson();
		String json = gson.toJson(consumers);
		System.out.println("Completed Json: " + json);

	}

}
