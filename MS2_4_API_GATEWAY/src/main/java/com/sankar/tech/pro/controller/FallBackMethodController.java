package com.sankar.tech.pro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
	
	@GetMapping("/userServiceFallBack")
	public String userServiceFallBack()
	{
		return "User Service is taking longer than expected, Please try later";
	}
	
	@GetMapping("/deptServiceFallBack")
	public String deptServiceFallBack()
	{
		return "Department Service is taking longer than expected, Please try later";
	}

}
