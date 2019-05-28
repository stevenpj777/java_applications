package com.steven.authentication.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.steven.authentication.models.Message;
import com.steven.authentication.repositories.MessageRepository;

public class MessageService {
	private MessageRepository messageRepository;

	public MessageService(MessageRepository messageRepository) {
		super();
		this.messageRepository = messageRepository;
	}
	
	public void create(Message message) {
		messageRepository.save(message);
	}
	
	public ArrayList<Message> all() {
		return (ArrayList<Message>)messageRepository.findAll();
	}
	public Message findById(long id) {
		return (Message)messageRepository.findOne(id);
	}
	
//	public void destroy(long id) {
//		messageRepository.delete(id);
//	}
}
