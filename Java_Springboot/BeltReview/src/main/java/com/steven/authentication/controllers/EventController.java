package com.steven.authentication.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.steven.authentication.models.Event;
import com.steven.authentication.models.Message;
import com.steven.authentication.models.User;
import com.steven.authentication.services.EventService;
import com.steven.authentication.services.MessageService;
import com.steven.authentication.services.UserService;

@Controller
@RequestMapping("/events")
public class EventController {
	private EventService eventService;
	private UserService userService;
	private MessageService messageservice;

	public EventController(EventService eventService, UserService userService) {
		this.eventService = eventService;
		this.userService = userService;
		this.messageservice = messageservice;
	}



@RequestMapping("")
public String events(@ModelAttribute("event") Event event, HttpSession session, Model model, Message message)	{
	long user_id = (long)session.getAttribute("userId");
	User user = userService.findUserById(user_id);
	
	ArrayList<Event> userStates = eventService.findByState(user.getState());
	ArrayList<Event> notUserStates = eventService.findNotByState(user.getState());
	
	model.addAttribute("userStates", userStates);
	model.addAttribute("notUserStates", notUserStates);
	  return "/registration/events.jsp";		
 
}

@PostMapping("/new")
public String create(@Valid @ModelAttribute("event") Event event, BindingResult res) {
	if(res.hasErrors()) {
		  return "/registration/events.jsp";		
	} else {
		eventService.create(event);
	}
	return "redirect:/events";
}
	
@RequestMapping("/{id}")
public String showEvent(@PathVariable("id") long id, Model model, @ModelAttribute("message") Message message) {
	model.addAttribute("event", eventService.findEventById(id));
//	System.out.println(eventService.findEventById(id));
	

	return "/registration/showEvent.jsp";
}


}
