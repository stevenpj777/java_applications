package com.steven.theCode;

//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.time.LocalTime;
//import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/code", method=RequestMethod.POST) 
	public String code(@RequestParam(value="code") String code, RedirectAttributes redirectAttributes) {
		System.out.println("code is: " + code);
		if (code.equals("bushido")) {
			System.out.println("matches");
			return "code.jsp";
			
	} else
		redirectAttributes.addFlashAttribute("error", "failed to guess correctly");
		 return "redirect:/";
	}

}