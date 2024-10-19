package com.example.SafetyNet_Alerts.service;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SafetyNet_Alerts.controller.FireStationController;
import com.example.SafetyNet_Alerts.domain.FireStation;
import com.example.SafetyNet_Alerts.exception.DuplicateFireStationException;
import com.example.SafetyNet_Alerts.repository.FireStationRepository;

@Service
public class FireStationService {
	
	Logger logger = LoggerFactory.getLogger(FireStationService.class);
		
	@Autowired
	private FireStationRepository fireStationRepository;
	
	// Constructor
	public FireStationService(FireStationRepository fireStationRepository) {
		super();
		this.fireStationRepository = fireStationRepository;
	}
	
	// Get list of fire stations
	public List<FireStation> getFireStations() {
		List<FireStation> fireStations = fireStationRepository.getList();
		return fireStations;
	}
	
	public FireStation findFireStationById(String address) {
		return fireStationRepository.findByAddress(address);
	}
	
	public FireStation findFireStationByStationNumber(String stationNumber) {
		return fireStationRepository.findByStation(stationNumber);
	}
	
	public void addOrUpdateFireStations(FireStation fireStation) throws DuplicateFireStationException {
		FireStation existingFireStation = findFireStationById(fireStation.getAddress());
		
		if (existingFireStation == null) {
			if (fireStationRepository.findByAddress(fireStation.getAddress())!=null) {
				throw new DuplicateFireStationException();
			}
			fireStationRepository.addFireStation(fireStation);
		} else {
			existingFireStation.setAddress(fireStation.getAddress());
			existingFireStation.setStation(fireStation.getStation());
		}
	}

}
