package com.steven.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.steven.relationships.models.Dojo;

import com.steven.relationships.repositories.DojoRepository;

@Service
public class DojoService {

	private final DojoRepository dojoRepository;
	
	  public DojoService(DojoRepository dojoRepository) {
	        this.dojoRepository = dojoRepository;
	    }
	  
	    // LIST ALL DOJOS
	    public List<Dojo> allDojos() {
	        return dojoRepository.findAll();
	    }
	    
    	public Dojo createDojo(Dojo b) {
    		return dojoRepository.save(b);
    }
    
    	
    	//FIND ALL DOJOS
    	public List<Dojo> getAllDojos() {
    		return (List<Dojo>) dojoRepository.findAll();
    		}
    	
    	//FIND ONE SINGLE DOJO
    	public Dojo getOneById(Long id) {
            Optional<Dojo> optionalDojo = dojoRepository.findById(id);
            if(optionalDojo.isPresent()) {
                return optionalDojo.get();
            } else {
                return null;
            }
    	}

	
	  

}
