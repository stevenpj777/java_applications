package com.steven.ninjaGold;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 1);
			session.setAttribute("totalGold", 0);
			session.setAttribute("activities", new ArrayList<String>());
		}	
		return "index.jsp";
	}
	
	@RequestMapping("/process_money")
	public String processMoney(@RequestParam(value="place") String place, HttpSession session) {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		Random ran = new Random();
		int win_lose = ran.nextInt(2);
		int farm_gold = ran.nextInt((20 - 10) + 1) + 10;
		int cave_gold = ran.nextInt((10 - 5) + 1) + 5;
		int house_gold = ran.nextInt((5 - 2) + 1) + 2;
		int casino_gold = ran.nextInt((50 - 0) + 1) + 0;
		
		//FARM
		if (place.equals("farm")) {
			Integer myGold = (Integer) session.getAttribute("totalGold");
			System.out.println("mygold " + myGold);
			session.setAttribute("totalGold", myGold+farm_gold);
			ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");
			activities.add("You entered a farm and earned "+farm_gold+" gold. ("+timeStamp+")");
		}
		
	//CAVE
		else if (place.equals("cave")) {
			Integer myGold = (Integer) session.getAttribute("totalGold");
			session.setAttribute("totalGold", myGold+cave_gold);
			ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");
			activities.add("You entered a cave and earned "+cave_gold+" gold. ("+timeStamp+")");
		} 
		
		//HOUSE
		else if (place.equals("house") && win_lose == 0) {
			Integer myGold = (Integer) session.getAttribute("totalGold");
			session.setAttribute("totalGold", myGold+house_gold);
			ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");
			activities.add("You entered a house and earned "+house_gold+" gold. ("+timeStamp+")");

		} 
		
//		//CASINO
//		else if (place.equals("casino") && win_lose == 0) {
//			Integer myGold = (Integer) session.getAttribute("totalGold");
//			session.setAttribute("totalGold", myGold+casino_gold);
//
//		} else {
//			Integer myGold = (Integer) session.getAttribute("totalGold");
//			session.setAttribute("totalGold", myGold-casino_gold);
//		}
		//CASINO
		else if (place.equals("casino")) {
			Integer myGold = (Integer) session.getAttribute("totalGold");
			if (win_lose == 0) {
				session.setAttribute("totalGold", myGold-casino_gold);
				ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");
				activities.add("You entered a casino and lost "+casino_gold+" gold. ("+timeStamp+")");
			} 
			else {
				session.setAttribute("totalGold", myGold+casino_gold);
				ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");
				activities.add("You entered a casino and earned "+casino_gold+" gold. ("+timeStamp+")");

			}	
		} 
		
		return "redirect:/";
	}

}
