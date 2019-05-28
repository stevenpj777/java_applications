package com.steven.relationships.services;



import java.util.List;

import org.springframework.stereotype.Service;

import com.steven.relationships.models.License;
import com.steven.relationships.repositories.LicenseRepository;


@Service
public class LicenseService {

private final LicenseRepository licenseRepository;

	public static int count= 00000001;
    
    public LicenseService(LicenseRepository licenseRepository) {
        this.licenseRepository = licenseRepository;
    }

    
    // returns all the Songs
    public List<License> allPersons() {
    	count++;
    	System.out.println(count);
        return licenseRepository.findAll();
    }
    
    // creates a Song
    public License createSong(License b) {
        return licenseRepository.save(b);
    }
	
    
    
    
    
    
}
