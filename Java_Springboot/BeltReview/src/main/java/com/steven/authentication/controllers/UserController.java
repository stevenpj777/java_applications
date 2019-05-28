package com.steven.authentication.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.steven.authentication.models.User;
import com.steven.authentication.services.UserService;
import com.steven.authentication.validators.UserValidator;

//imports removed for brevity
@Controller
public class UserController {
 private final UserService userService;
 private final UserValidator userValidator;
 
 public UserController(UserService userService,UserValidator userValidator) {
     this.userService = userService;
     this.userValidator = userValidator;
 }
 
 @RequestMapping("/registration")
 public String registerForm(@ModelAttribute("user") User user) {
     return "/registration/registrationPage.jsp";
 }
 @RequestMapping("/login")
 public String login() {
     return "/registration/loginPage.jsp";
 }
 
 @RequestMapping(value="/registration", method=RequestMethod.POST)
 public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
	 userValidator.validate(user, result);
	 if(result.hasErrors() ) {
		 return "/registration/registrationPage.jsp"; 
	 }
	 User u = userService.registerUser(user);
	 session.setAttribute("userId", u.getId());
	 return "redirect:/home";

 }
 
 @RequestMapping(value="/login", method=RequestMethod.POST)
 public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
	 boolean isAuthenticated = userService.authenticateUser(email, password);
	 if(isAuthenticated) {
		 User u = userService.findByEmail(email);
		 session.setAttribute("userId", u.getId());
		 return "redirect:/home";
		  } else {
			  model.addAttribute("error", "Invalid Credentials. Please try again.");
			  return "/registration/loginPage.jsp";		
		  }
 }
 

 
 @RequestMapping("/home")
 public String home(HttpSession session, Model model) {
     Long userId = (Long) session.getAttribute("userId");
     User u = userService.findUserById(userId);
     model.addAttribute("user", u);
//     return "/registration/homePage.jsp";
	 return "redirect:/events";

 
 }
 
 
 @RequestMapping("/logout")
 public String logout(HttpSession session) {
	 session.invalidate();
	 return "redirect:/login";
 }
 
}
