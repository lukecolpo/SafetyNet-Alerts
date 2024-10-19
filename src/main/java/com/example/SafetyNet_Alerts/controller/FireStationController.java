package com.example.SafetyNet_Alerts.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SafetyNet_Alerts.domain.FireStation;
import com.example.SafetyNet_Alerts.domain.Person;
import com.example.SafetyNet_Alerts.service.FireStationService;
import com.example.SafetyNet_Alerts.service.PersonService;


@RestController
public class FireStationController {

	Logger logger = LoggerFactory.getLogger(FireStationController.class);
	
	@Autowired
	FireStationService fireStationService;
	
	@Autowired
	PersonService personService;
	
	public FireStationController(FireStationService fireStationService) {
		super();
		this.fireStationService = fireStationService;
		this.personService = personService;
	}
	
	@GetMapping("/firestations")
	public List<FireStation> getFireStations() {
		
		logger.info("GET /firestations called");
		
		return fireStationService.getFireStations();
	}
	
	@GetMapping("/firestation")
	public List<Person> getPeopleByStationNumber(@RequestParam String stationNumber) {
		
		logger.info("GET /firestation " + stationNumber+" called");
		FireStation fireStation = fireStationService.findFireStationByStationNumber(stationNumber);
		String address = fireStation.getAddress();
		
		List<Person> people = personService.findPersonByAddress(address);
		return people;
	}

}
