package com.example.SafetyNet_Alerts.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.SafetyNet_Alerts.domain.AllData;
import com.example.SafetyNet_Alerts.domain.MedicalRecord;
import com.example.SafetyNet_Alerts.utilities.DataLoader;

@Repository
public class MedicalRecordRepository {
	Logger logger = LoggerFactory.getLogger(MedicalRecordRepository.class);
	
	@Autowired
	DataLoader dataLoader;
	
	AllData allData = DataLoader.loadData();
	List<MedicalRecord> medicalRecords = allData.getMedicalRecords();
	
	public void addMedicalRecord(MedicalRecord medicalRecord) {
		medicalRecords.add(medicalRecord);
	}
	
	public MedicalRecord findByBirthdate(String birthdate) {
		for (MedicalRecord medicalRecord : medicalRecords) {
			if (medicalRecord.getBirthdate().equals(birthdate)) {
				return medicalRecord;
			}
		}
		return null;
	}

}
