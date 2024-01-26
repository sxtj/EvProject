package com.ethanscompany.evproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ethanscompany.evproject.model.EvChargingStation;

@RestController
public class EvProjectController {
	
	@GetMapping("/test")
	public String test() {
		return "Hello world!";
	}
	
	@PostMapping("/evChargingStations")
	public boolean addEvChargingStation(@RequestBody(required=false) EvChargingStation evChargingStation) {
		if(evChargingStation != null) {
			return true;
		}
		return false;
	}

}
