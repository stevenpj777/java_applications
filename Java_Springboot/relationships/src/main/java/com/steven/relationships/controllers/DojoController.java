package com.steven.relationships.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.steven.relationships.models.Dojo;
import com.steven.relationships.models.Ninja;
import com.steven.relationships.services.DojoService;
import com.steven.relationships.services.NinjaService;


@Controller
public class DojoController {
	private final DojoService dojoService;
	private final NinjaService ninjaService;

    public DojoController(DojoService dojoService, NinjaService ninjaService) {
        this.dojoService = dojoService;
        this.ninjaService = ninjaService;
	    }
    
	//FIRST DISPLAY ADD NEW DOJO
	@RequestMapping("/dojos/new")
	public String addNew(@ModelAttribute("dojo") Dojo dojo, Model model) {
		return "/persons/dojo.jsp";
	}
	
	//DISPLAY ALL DOJOS
	//CREATE LIST OF ALL NEWUSERS TAHT ARE NOT STUPID
	
    
    // CREATES NEW DOJO

	@PostMapping("/dojos/new")
    public String create(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {

        if (result.hasErrors()) {
            return "/persons/dojo.jsp";
        } else {
            dojoService.createDojo(dojo);

//            return "redirect:/persons/dojo.jsp";
            return "redirect:/dojos/new";
        }
    }
    
    
    
 	//FIRST DISPLAY ADD NEW NINJA
 	@RequestMapping("/ninjas/new")
 	public String addNew(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> dojoslist = dojoService.allDojos();
		System.out.println(dojoslist);
		model.addAttribute("dojoslist", dojoslist);
 		return "/persons/ninja.jsp";
 	}
    
    // CREATES NEW NINJA
    @RequestMapping(value="/ninjas/new", method=RequestMethod.POST)
    public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
        if (result.hasErrors()) {
            return "/persons/ninja.jsp";
        } else {
            ninjaService.createNinja(ninja);

            return "redirect:/ninjas/new";  
        }
    }
    
  //display each dojo info
    @RequestMapping("dojos/{id}")
    public String displayinfo(@PathVariable("id")Long id, Model model) {
    Dojo myDojo = dojoService.getOneById(id);
    
    model.addAttribute("dojo",myDojo);
//    model.addAttribute("ninjas", ninjaService.allNinjas());
    model.addAttribute("ninjas", myDojo.getNinjas());

//    System.out.println(ninjaService.allNinjas());

    return "/persons/allDojos.jsp";
    }


    
    
    
}
