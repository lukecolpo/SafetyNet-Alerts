package com.example.SafetyNet_Alerts.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.SafetyNet_Alerts.service.FireStationService;


@RestController
public class FireStationController {

	Logger logger = LoggerFactory.getLogger(FireStationController.class);
	
	@Autowired
	FireStationService fireStationService;

}
