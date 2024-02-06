package com.ethanscompany.evproject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ethanscompany.evproject.model.EvChargingStation;
import com.ethanscompany.evproject.model.Location;

@Service
public class EvChargingStationService {
	
	List<EvChargingStation> allEvChargingStations = new ArrayList<>();	
	boolean add(EvChargingStation evChargingStation) {
		
		return false;
		
	}
	
	public List<EvChargingStation> initLoadChargingStations() {
		
		Location location = new Location();
		location.setCity("Manitou Springs");
		
		EvChargingStation manitouEvStation = new EvChargingStation();
		manitouEvStation.setId(124);
		manitouEvStation.setLocation(location);
		
		allEvChargingStations.add(manitouEvStation);
		
		return allEvChargingStations;
		
		
		
		
	}
	

}
