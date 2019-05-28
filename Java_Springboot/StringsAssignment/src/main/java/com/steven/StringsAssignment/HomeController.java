package com.steven.StringsAssignment;


//2. Importing dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HomeController {
	
	@RequestMapping("/")
	public String Hello() {
		return "Hello Client How are you doing?";
	}
	
	@RequestMapping("/random") 
	public String Random() {
		return "Spring Boot is great! So easy to respond to things!";
	}

}
