package com.ethanscompany.evproject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ethanscompany.evproject.model.EvChargingStation;
import com.ethanscompany.evproject.service.EvChargingStationService;

@RestController
public class EvProjectController {
	
	@Autowired
	EvChargingStationService service;
	
	@GetMapping("/test")
	public String test() {
		return "Hello world!";
	}
	
	@PostMapping("/evChargingStations")
	public boolean addEvChargingStation(@RequestBody(required=false) EvChargingStation evChargingStation) {
		if(evChargingStation != null) {
			service.addEvChargingStation(evChargingStation);
			return true;
		}
			
		
		return false;
	}
	
	@GetMapping("/evChargingStations")
	public List<EvChargingStation> getChargingStation() {
		return service.initLoadChargingStations();
	}

}
