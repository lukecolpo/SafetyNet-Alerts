package com.example.SafetyNet_Alerts.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SafetyNet_Alerts.domain.Person;
import com.example.SafetyNet_Alerts.repository.PersonRepository;

@Service
public class PersonService {
	
	Logger logger = LoggerFactory.getLogger(PersonService.class);
	
	@Autowired
	private PersonRepository personRepository;
	
	// Constructor
	public PersonService(PersonRepository personRepository) {
		super();
		this.personRepository = personRepository;
	}
	
	// Get list of people
	public List<Person> getPeople() {
		List<Person> people = personRepository.getList();
		return people;
	}
	
	// Find people by address
	public List<Person> findPersonByAddress(String address) {
		return personRepository.findByAddress(address);
	}

}
