package com.ethanscompany.evproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvProjectController {
	
	@GetMapping("/test")
	public String test() {
		return "Hello world!";
	}

}
