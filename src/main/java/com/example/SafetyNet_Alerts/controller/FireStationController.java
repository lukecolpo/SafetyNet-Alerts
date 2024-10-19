package com.example.SafetyNet_Alerts.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SafetyNet_Alerts.domain.FireStation;
import com.example.SafetyNet_Alerts.service.FireStationService;


@RestController
public class FireStationController {

	Logger logger = LoggerFactory.getLogger(FireStationController.class);
	
	@Autowired
	FireStationService fireStationService;
	
	public FireStationController(FireStationService fireStationService) {
		super();
		this.fireStationService = fireStationService;
	}
	
	@GetMapping("/firestations")
	public List<FireStation> getFireStations() {
		
		logger.info("GET /firestations called");
		
		return fireStationService.getFireStations();
	}

}
