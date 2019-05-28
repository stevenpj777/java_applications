package com.steven.authentication.services;

import org.springframework.stereotype.Service;

import com.steven.authentication.models.Message;
import com.steven.authentication.repositories.MessageRepository;

@Service
public class MessageService {
	private final MessageRepository messageRepository;

	public MessageService(MessageRepository messageRepository) {
		super();
		this.messageRepository = messageRepository;
	}
	
	
}
