package com.steven.relationships.services;

import java.util.List;

import org.springframework.stereotype.Service;


import com.steven.relationships.models.Person;
import com.steven.relationships.repositories.RelationshipRepository;


@Service
public class RelationshipService {

private final RelationshipRepository relationshipRepository;
    
	public static int count= 00000001;
	
    public RelationshipService(RelationshipRepository relationshipRepository) {
        this.relationshipRepository = relationshipRepository;
    }



    // returns all the Songs
    public List<Person> allPersons() {
        return relationshipRepository.findAll();
    }
    
    // creates a Song
    
    	public Person createSong(Person b) {
    	count++;
    	System.out.println(count);
    	
        return relationshipRepository.save(b);
    }
	
    
    
    
    
    
}
