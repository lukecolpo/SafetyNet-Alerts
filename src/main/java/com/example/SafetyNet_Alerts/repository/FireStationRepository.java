package com.example.SafetyNet_Alerts.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.SafetyNet_Alerts.domain.AllData;
import com.example.SafetyNet_Alerts.domain.FireStation;
import com.example.SafetyNet_Alerts.init.DataLoader;

@Repository
public class FireStationRepository {
	
	Logger logger = LoggerFactory.getLogger(FireStationRepository.class);
	
	@Autowired
	DataLoader dataLoader;
	
	AllData allData = DataLoader.loadData();
	List<FireStation> fireStations = allData.getFireStations();
		
	public List<FireStation> getList() {
		return fireStations;
	}
	
	public void addFireStation(FireStation fireStation) {
		fireStations.add(fireStation);
	}
	
	public FireStation findByAddress(String address) {
		for (FireStation fireStation : fireStations) {
			if(fireStation.getAddress().equals(address)) {
				return fireStation;
			}
		}
		return null;
	}
	
	public FireStation findByStation(String station) {
		for (FireStation fireStation : fireStations) {
			if(fireStation.getStation().equals(station)) {
				return fireStation;
			}
		}
		return null;
	}
}
