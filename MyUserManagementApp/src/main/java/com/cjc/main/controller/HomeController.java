package com.cjc.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HomeController {
	
	
	@GetMapping("/test-api")    // http://localhost:9091/test-api
	public String ontest() {
		
		return "Working Fine";
		
	}

}
