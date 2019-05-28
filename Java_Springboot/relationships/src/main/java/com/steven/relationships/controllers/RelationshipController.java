package com.steven.relationships.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.steven.relationships.models.License;
import com.steven.relationships.models.Person;
import com.steven.relationships.services.LicenseService;
import com.steven.relationships.services.RelationshipService;


@Controller
public class RelationshipController {
	   private final RelationshipService relationshipService;
	   private final LicenseService licenseService;
	   
	   public static int count= 00000001;
	    
	    public RelationshipController(RelationshipService relationshipService, LicenseService licenseService) {
	        this.relationshipService = relationshipService;
	        this.licenseService = licenseService;
		    }
	    
//	    public RelationshipController(LicenseService licenseService) {
//	        this.licenseService = licenseService;
//		    }
//	    
		//FIRST DISPLAY ADD NEW USER
		@RequestMapping("/persons/new")
		public String addNew(@ModelAttribute("person") Person person, Model model) {
			return "/persons/new.jsp";
		}
	    
	    // CREATES NEW SONG
	    @RequestMapping(value="/persons/new", method=RequestMethod.POST)
	    public String create(@Valid @ModelAttribute("song") Person song, BindingResult result) {
	        if (result.hasErrors()) {
	            return "/persons/new.jsp";
	        } else {
	            relationshipService.createSong(song);
//	            count = count + 1;
//	            System.out.println("count = " + count);
	            return "redirect:/persons/new";  
	        }
	    }
	   
	    
		//FIRST DISPLAY ADD NEW License
		@RequestMapping("/licenses/new")
		public String add(@ModelAttribute("license") License license, Model model) {
			List<Person> personslist = relationshipService.allPersons();
			model.addAttribute("personslist", personslist);
			return "/persons/license.jsp";
		}
		
	    // CREATES NEW SONG
	    @RequestMapping(value="/licenses/new", method=RequestMethod.POST)
	    public String createLicense(@Valid @ModelAttribute("license") License license, BindingResult result) {
	        if (result.hasErrors()) {
	            return "/persons/license.jsp";
	        } else {
	            licenseService.createSong(license);

	            return "redirect:/persons/new";  
	        }
	    }




	    
	    
	    
}
