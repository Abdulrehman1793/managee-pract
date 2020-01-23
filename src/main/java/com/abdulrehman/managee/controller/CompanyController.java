package com.abdulrehman.managee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
	@GetMapping("/greet")
	private String greeting() {
		return "Hello company";
	}
}
