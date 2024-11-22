package com.learning.unmarshal;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.learning.binding.Student;

public class UnMarshalDemo {

	public static void main(String[] args) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Student.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Student student = (Student) unmarshaller.unmarshal(new File("Student.xml"));
		System.out.println(student);
	}

}
