package com.steven.dojoSurvey;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/results")
	public String results(@RequestParam(value="name") String name, @RequestParam(value="location") String location, 
			@RequestParam(value="language") String language, @RequestParam(value="comments") String comments,
			Model model) {
		model.addAttribute("name", name);
		model.addAttribute("location", location);
		model.addAttribute("language", language);
		model.addAttribute("comments", comments);
		
		return "result.jsp";
	}
	
}
