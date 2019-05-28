package com.steven.relationships.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.steven.relationships.models.License;
//import com.steven.relationships.models.Dojo;
import com.steven.relationships.models.Ninja;
import com.steven.relationships.repositories.NinjaRepository;

@Service
public class NinjaService {
	private final NinjaRepository ninjaRepository;
	
	  public NinjaService(NinjaRepository ninjaRepository) {
	        this.ninjaRepository = ninjaRepository;
	    }

	    // LIST ALL DOJOS
	    public List<Ninja> allNinjas() {
	        return ninjaRepository.findAll();
	    }
	    
	    // creates a Song
	    public Ninja createNinja(Ninja b) {
	        return ninjaRepository.save(b);
	    }
		
	  
	  
	  
}
