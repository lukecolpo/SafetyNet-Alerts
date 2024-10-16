package com.example.SafetyNet_Alerts.domain;

import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class AllData {

	private List<Person> people;
    private List<FireStation> fireStations;
    private List<MedicalRecord> medicalRecords;
    
	public AllData(List<FireStation> fireStations, List<MedicalRecord> medicalRecords, List<Person> people) {
		this.setFireStations(fireStations);
		this.setMedicalRecords(medicalRecords);
		this.setPeople(people);
	}

	public List<MedicalRecord> getMedicalRecords() {
		return medicalRecords;
	}

	public void setMedicalRecords(List<MedicalRecord> medicalRecords) {
		this.medicalRecords = medicalRecords;
	}

	public List<FireStation> getFireStations() {
		return fireStations;
	}

	public void setFireStations(List<FireStation> fireStations) {
		this.fireStations = fireStations;
	}

	public List<Person> getPeople() {
		return people;
	}

	public void setPeople(List<Person> people) {
		this.people = people;
	}

}
