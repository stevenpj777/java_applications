package com.steven.routing;

//2. Importing dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/coding")
public class CodingController {

	@RequestMapping("/")
	public String Coding() {
		return "Hello Coding Dojo";
	}
	@RequestMapping("/python")
	public String Python() {
		return "Python/Django is awesome!";
	}
	@RequestMapping("/java")
	public String Java() {
		return "Java/Spring is better!";
	}
}
