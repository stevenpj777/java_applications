package com.steven.authentication.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.steven.authentication.models.Message;

@Repository
public interface MessageRepository extends CrudRepository <Message, Long> {

}

