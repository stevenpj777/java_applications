package com.steven.authentication.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.steven.authentication.models.Event;
import com.steven.authentication.repositories.EventRepository;


@Service
public class EventService {
	private final EventRepository eventRepository;

	public EventService(EventRepository eventRepository) {
		this.eventRepository = eventRepository;
	}
	
	//FIND ONE SINGLE Product
	public Event getOneById(Long id) {
        Optional<Event> optionalEvent = eventRepository.findById(id);
        if(optionalEvent.isPresent()) {
            return optionalEvent.get();
        } else {
            return null;
        }
	}
	
 	public Event createEvent(Event b) {
  		return eventRepository.save(b);
  }
    
  

}
