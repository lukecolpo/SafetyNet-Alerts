package com.example.SafetyNet_Alerts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.example.SafetyNet_Alerts.domain.AllData;
import com.example.SafetyNet_Alerts.init.DataLoader;

@SpringBootApplication
public class SafetyNetAlertsApplication extends SpringBootServletInitializer {
	
	@Autowired
	DataLoader dataLoader;

	public static void main(String[] args) {
		SpringApplication.run(SafetyNetAlertsApplication.class, args);		
	}
	
	@Bean
	public AllData init() {
		return dataLoader.LoadData();
	}
}
