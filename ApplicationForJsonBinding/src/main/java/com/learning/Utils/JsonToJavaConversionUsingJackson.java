package com.learning.Utils;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.learning.binding.Consumers;

public class JsonToJavaConversionUsingJackson {

	public static void main(String[] args) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		Consumers consumers = mapper.readValue(new File("Consumers.json"), Consumers.class);
		System.out.println(consumers);
	}

}
