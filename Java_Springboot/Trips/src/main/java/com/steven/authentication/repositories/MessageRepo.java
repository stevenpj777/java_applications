package com.steven.authentication.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.steven.authentication.models.Message;


@Repository
public interface MessageRepo extends CrudRepository <Message, Long>{

}
