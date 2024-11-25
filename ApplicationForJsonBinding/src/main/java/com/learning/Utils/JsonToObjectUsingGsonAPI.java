package com.learning.Utils;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.learning.binding.Consumers;

public class JsonToObjectUsingGsonAPI {

	public static void main(String[] args) throws JsonSyntaxException, JsonIOException, FileNotFoundException {
		Gson gson = new Gson();
		Consumers consumers = gson.fromJson(new FileReader("Consumers.json"), Consumers.class);
		System.out.println(consumers);
	}

}
