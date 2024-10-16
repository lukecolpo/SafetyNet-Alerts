package com.example.SafetyNet_Alerts.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.SafetyNet_Alerts.domain.FireStation;

@Repository
public class FireStationRepository {
	
	List<FireStation> fireStations = new ArrayList<FireStation>();
	
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
			if(fireStation.getAddress().equals(station)) {
				return fireStation;
			}
		}
		return null;
	}
}
