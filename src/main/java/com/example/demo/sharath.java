package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class sharath {
	@GetMapping("/user")

	public String user()
	{
		return "kusuru sharath kumar reddy";
		
	}

	}


