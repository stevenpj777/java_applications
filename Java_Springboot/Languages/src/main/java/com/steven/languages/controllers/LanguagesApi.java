package com.steven.languages.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.steven.languages.models.Language;
import com.steven.languages.services.LanguageService;


public class LanguagesApi {

	
    private final LanguageService languageService;
    public LanguagesApi(LanguageService languageService){
        this.languageService = languageService;
    }
    @RequestMapping("/api/languages")
    public List<Language> index() {
        return languageService.allLanguages();
    }
    
    //THIS NEEDS TO MAP TO THE CONTGRUCGTOR METHOD IN MODEL
    @RequestMapping(value="/api/languages", method=RequestMethod.POST)
    public Language create(@RequestParam(value="name") String name, @RequestParam(value="creator") String creator, @RequestParam(value="currentVersion") String currentVersion) {
        Language language = new Language(name, creator, currentVersion);
        return languageService.createLanguage(language);
    }
	
}
