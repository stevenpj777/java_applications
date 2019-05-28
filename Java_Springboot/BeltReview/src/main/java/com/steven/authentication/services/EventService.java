package com.steven.authentication.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.steven.authentication.models.Event;
import com.steven.authentication.repositories.EventRepository;

@Service
public class EventService {
	private EventRepository eventRepository;

	public EventService(EventRepository eventRepository) {
		this.eventRepository = eventRepository;
	}
	
	public void create(Event event) {
		eventRepository.save(event);
	}
	
	public ArrayList<Event> all() {
		return (ArrayList<Event>)eventRepository.findAll();
	}
	
    public Event findEventById(Long id) {
    	Optional<Event> e = eventRepository.findById(id);
    	if(e.isPresent()) {
            return e.get();
    	}
    	else {
    	    return null;
    	}
    }
//	public Event findById(long id) {
//		
//		return eventRepository.findById(id);
//	}
	
//	public void destroy(long id) {
//		eventRepository.delete(id);
//	}
	
    public ArrayList<Event> findByState(String state) {
    	return eventRepository.findByState(state); 
    }
    public ArrayList<Event> findNotByState(String state) {
    	return eventRepository.findNotByState(state); 
    }
    
}
