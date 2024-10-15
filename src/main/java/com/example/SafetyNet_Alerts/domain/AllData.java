package com.example.SafetyNet_Alerts.domain;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AllData {

	private List<Person> people;
    private List<FireStation> fireStations;
    private List<MedicalRecord> medicalRecords;
    
	public AllData(List<FireStation> fireStations, List<MedicalRecord> medicalRecords, List<Person> people) {
		this.fireStations = fireStations;
		this.medicalRecords = medicalRecords;
		this.people = people;
	}
}
