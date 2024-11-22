package com.learning.marshal;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.learning.binding.Address;
import com.learning.binding.Student;

public class MarshallingLogic {

	public static void main(String[] args) throws JAXBException {
		Address address = new Address();
		address.setCity("Kanchipuram");
		address.setCountry("India");
		address.setPincode(631501);
		address.setState("TamilNadu");
		Address address1 = new Address();
		address1.setCity("Chennai");
		address1.setCountry("India");
		address1.setPincode(600015);
		address1.setState("TamilNadu");
		Address address2 = new Address();
		address2.setCity("Coimbatore");
		address2.setCountry("India");
		address2.setPincode(456789);
		address2.setState("TamilNadu");

		List<Address> addressList = Arrays.asList(address, address1, address2);
		Student student = new Student();
		student.setAddress(addressList);
		student.setId(2);
		student.setName("Velangiri");
		student.setSex("male");

		JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.marshal(student, new File("Student.xml"));
		System.out.println("Marshall Process COmpleted!");
	}

}
