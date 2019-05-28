package com.steven.hellohuman;

//2. Importing dependencies
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HomeController {
	@RequestMapping("/")
	public String getFoos(@RequestParam(defaultValue = "human") String name) {
	    return "Hello: " + name;
	}
	
}
