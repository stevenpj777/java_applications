package com.steven.authentication.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.steven.authentication.models.Event;

@Repository
public interface EventRepository  extends CrudRepository<Event, Long> {

}
