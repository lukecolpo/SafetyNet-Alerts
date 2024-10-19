package com.example.SafetyNet_Alerts.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.SafetyNet_Alerts.domain.AllData;
import com.example.SafetyNet_Alerts.domain.Person;
import com.example.SafetyNet_Alerts.init.DataLoader;

@Repository
public class PersonRepository {
	Logger logger = LoggerFactory.getLogger(PersonRepository.class);
	
	@Autowired
	DataLoader dataLoader;
	
	AllData allData = DataLoader.loadData();
	List<Person> people = allData.getPeople();
	
	public List<Person> getList() {
		return people;
	}
	
	public Person findByAddress(String address) {
		for (Person person : people) {
			if(person.getAddress().equals(address)) {
				return person;
			}
		}
		return null;
	}

}
