package com.example.SafetyNet_Alerts.utilities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

@Component
public class AgeCalculator {

	public boolean isAdult(String birthdateString) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM/DD/YYYY");
        LocalDate birthdate = LocalDate.parse(birthdateString, f);
        LocalDate isAdult = today.minusYears(18);
        
        if (birthdate.isBefore(isAdult) || birthdate.isEqual(isAdult)) {
        	return true;
        } else {
        return false;
        }
	}
}
