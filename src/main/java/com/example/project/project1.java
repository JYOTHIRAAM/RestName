package com.example.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class project1 {
	@GetMapping("/Welcome1")
	public String Welcome() {
		String name="Raam";
		return "Welcome "+name+"!";
	}
	
}