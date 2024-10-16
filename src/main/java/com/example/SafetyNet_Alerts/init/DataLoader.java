package com.example.SafetyNet_Alerts.init;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.SafetyNet_Alerts.domain.AllData;
import com.example.SafetyNet_Alerts.domain.FireStation;
import com.example.SafetyNet_Alerts.domain.MedicalRecord;
import com.example.SafetyNet_Alerts.domain.Person;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class DataLoader {

	// Load data from JSON files
	public static AllData loadData() {
		try {
			ObjectMapper mapper = new ObjectMapper();		
			List<FireStation> fireStations = Arrays.asList(mapper.readValue(Paths.get("./src/main/resources/data/FireStations.json").toFile(), FireStation[].class));
			List<MedicalRecord> medicalRecords = Arrays.asList(mapper.readValue(Paths.get("./src/main/resources/data/MedicalRecords.json").toFile(), MedicalRecord[].class));
			List<Person> people = Arrays.asList(mapper.readValue(Paths.get("./src/main/resources/data/Persons.json").toFile(), Person[].class));
			
			return new AllData(fireStations, medicalRecords, people);
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
