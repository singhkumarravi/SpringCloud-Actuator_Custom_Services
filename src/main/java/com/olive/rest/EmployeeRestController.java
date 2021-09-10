package com.olive.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeRestController {
	
	
	
	@GetMapping("/data")
	public String showData() {
		
		return "Hellow data Employee";
	}

}
