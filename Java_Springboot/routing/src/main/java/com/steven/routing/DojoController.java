package com.steven.routing;

//2. Importing dependencies
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{track}")
	public String showLesson(@PathVariable("track") String track){
		
		if (track.equals("dojo")) {
			track = "The dojo is awesome";
		} else if (track.equals("burbank")) {
			track = "Burbank Dojo is located in southern California";
		} else if (track.equals("san-jose")) {
			track = "SJ dojo is the headquarters";
		}
		
		
		return track;

    }

	
	
}


