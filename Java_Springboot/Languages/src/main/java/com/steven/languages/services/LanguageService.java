package com.steven.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.steven.languages.models.Language;
import com.steven.languages.repositories.LanguageRepository;



@Service
public class LanguageService {
	
	// adding the language repository as a dependency
    private final LanguageRepository languageRepository;
    
    public LanguageService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }
    // returns all the languages
    public List<Language> allLanguages() {
        return languageRepository.findAll();
    }
    // creates a language
    public Language createLanguage(Language b) {
        return languageRepository.save(b);
    }
    // retrieves a Language
    public Language findLanguage(Long id) {
        Optional<Language> optionalLanguage = languageRepository.findById(id);
        if(optionalLanguage.isPresent()) {
            return optionalLanguage.get();
        } else {
            return null;
        }
    }
    
 
    
    

    
    public void deleteLanguage(Long id) {
    	languageRepository.deleteById(id);
    }
    
}
