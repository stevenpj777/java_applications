package com.steven.authentication.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.steven.authentication.models.Event;
import com.steven.authentication.models.User;
import com.steven.authentication.services.EventService;
import com.steven.authentication.services.MessageService;
import com.steven.authentication.services.UserService;



@Controller
public class BeltController {
	private final EventService eventService;
	private final MessageService messageService;
	private final UserService userService;

	
	public BeltController(EventService eventService, MessageService messageService, UserService userService) {
	this.eventService = eventService;
	this.messageService = messageService;
	this.userService = userService;
}
	

	 @RequestMapping("/createEvent")
	 public String createEvent(@ModelAttribute("event") Event event) {
	     return "/registration/event.jsp";
	 }
	


	@RequestMapping(value="createEvent", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("event") Event event, BindingResult result,  HttpSession session) {
		if (result.hasErrors()) {
			 return "/registration/event.jsp";
		} else {
		     Long userId = (Long) session.getAttribute("userId");
		     User u = userService.findUserById(userId);
		     System.out.println(u.getId());
			u.eventService.createEvent(event);
//			return "redirect:/createEvent";
		}
	}
	
	
	
}
