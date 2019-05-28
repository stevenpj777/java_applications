package com.steven.languages.controllers;

import java.awt.print.Book;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.steven.languages.models.Language;
import com.steven.languages.services.LanguageService;



@Controller
public class LanguageController {
   private final LanguageService languageService;
	    
    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
	    }
    
    
	// HOME PAGE THAT SHOWS ALL languages
    @RequestMapping("/languages")
    public String index(@ModelAttribute("language") Language language, Model model) {
        List<Language> languages = languageService.allLanguages();
        model.addAttribute("languages", languages);
        return "/languages/index.jsp";
    }
    

    
    // CREATES NEW LANGUAGE
    @RequestMapping(value="/languages", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("language") Language language, BindingResult result) {
        if (result.hasErrors()) {
        	return "redirect:/languages";
        } else {
            languageService.createLanguage(language);
            return "redirect:/languages";
        }
    }
    
    
    // SHOWS INFO ON ONE LANGUAGE
    @RequestMapping("/languages/{id}")
//    public String showSingleBook(@PathVariable("id") Long id, Model model, BindingResult optionalBook) {
    public String showSingleLanguage(@PathVariable("id") Long id, Model model) {
    	Language language = languageService.findLanguage(id);
    	model.addAttribute("language", language);        	
    	return "/languages/show.jsp";
    }
    
    
    @RequestMapping("/languages/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        Language language = languageService.findLanguage(id);
        model.addAttribute("language", language);
        return "/languages/edit.jsp";
    }
    
    @RequestMapping(value="/languages/{id}", method=RequestMethod.PUT)
    public String update(@Valid @ModelAttribute("language") Language language, BindingResult result) {
        if (result.hasErrors()) {
            return "/languages/edit.jsp";
        } else {
        	languageService.createLanguage(language);
            return "redirect:/languages";
        }
    }
	@RequestMapping("/languages/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		languageService.deleteLanguage(id);
		return "redirect:/languages";
	}
    
    
}
