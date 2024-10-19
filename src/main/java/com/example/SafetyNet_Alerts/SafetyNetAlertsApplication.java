package com.example.SafetyNet_Alerts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.example.SafetyNet_Alerts.domain.AllData;
import com.example.SafetyNet_Alerts.utilities.DataLoader;



@SpringBootApplication
@ComponentScan
public class SafetyNetAlertsApplication extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
		SpringApplication.run(SafetyNetAlertsApplication.class, args);
	}

    @Bean
    AllData init() {
		return DataLoader.loadData();
	}
}
