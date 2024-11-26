package com.learning.restController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.binding.Patient;

@RestController
public class PatientController {

	@GetMapping(value = "/patient", produces = { "application/xml", "application/json" })
	public Patient getPatient() {
		Patient patient = new Patient();
		patient.setAddress("Kanchipuram");
		patient.setGender("Male");
		patient.setName("Ganesha");
		return patient;
	}

	@PostMapping(value = "/patient", produces = { "application/xml", "application/json", "text/plain" }, consumes = {
			"application/json", "application/xml" })
	public ResponseEntity<String> addPatient(@RequestBody Patient patient) {
		System.out.println(patient);
		return new ResponseEntity<>("Patient Record Added", HttpStatus.CREATED);
	}
}
