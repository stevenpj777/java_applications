package com.steven.counter;

import java.net.InetAddress;

import javax.servlet.http.HttpSession;

//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.time.LocalTime;
//import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index(HttpSession session) {
			
			if(session.getAttribute("count") == null) {
				session.setAttribute("count", 1);
			}else {
				Integer count = (Integer) session.getAttribute("count");
				count++;
				session.setAttribute("count", count);
			}
			Integer count = (Integer) session.getAttribute("count");
			System.out.println("session num : "+count);
			
		return "index.jsp";
	}
	
		@RequestMapping("/counter")
		public String counter(Model model, HttpSession session) throws Exception {
			model.addAttribute("counter", session.getAttribute("count"));
	
			return "counter.jsp";
		}
	

}
