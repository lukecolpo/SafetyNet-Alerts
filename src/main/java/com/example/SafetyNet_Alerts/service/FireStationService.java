package com.example.SafetyNet_Alerts.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.SafetyNet_Alerts.repository.FireStationRepository;

@Service
public class FireStationService {
	
	@Autowired
	private FireStationRepository fireStationRepository;

}
