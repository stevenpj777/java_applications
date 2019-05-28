package com.steven.authentication.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.steven.authentication.models.Event;



@Repository
public interface EventRepository extends CrudRepository <Event, Long> {
	ArrayList<Event> findByState(String state);
	
	@Query(value="SELECT * FROM events WHERE state !=?1", nativeQuery=true)
	ArrayList<Event> findNotByState(String state);
}

