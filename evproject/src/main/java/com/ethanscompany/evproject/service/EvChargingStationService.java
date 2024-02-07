package com.ethanscompany.evproject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ethanscompany.evproject.model.EvChargingStation;
import com.ethanscompany.evproject.model.Level;
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
		manitouEvStation.setLevel(Level.LEVEL_2);
		manitouEvStation.setStatus(true);
		manitouEvStation.setPricePerKWH(0.39);
		
		EvChargingStation cascadeEvStation = new EvChargingStation();
		cascadeEvStation.setId(1245);
		Location location2 = new Location();
		location2.setCity("Cascade");
		location2.setState("CO");
		cascadeEvStation.setLocation(location2);
		cascadeEvStation.setLevel(Level.LEVEL_2);
		cascadeEvStation.setStatus(true);
		cascadeEvStation.setPricePerKWH(0.39);
		
		allEvChargingStations.add(manitouEvStation);
		allEvChargingStations.add(cascadeEvStation);
		
		return allEvChargingStations;
		
		
		
		
	}
	

}
