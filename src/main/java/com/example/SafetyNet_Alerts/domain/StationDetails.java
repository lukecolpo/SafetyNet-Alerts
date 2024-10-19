package com.example.SafetyNet_Alerts.domain;

import java.util.List;
import java.util.Map;

public class StationDetails {

	private List<Person> people;
	
	private Map<String, String> summary;
	
	public StationDetails(List<Person> people, Map<String, String> summary) {
		super();
		this.people = people;
		this.summary = summary;
	}
}
