package com.example.SafetyNet_Alerts.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FireStation {
	
	private String address;
	
	private String station;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

}
