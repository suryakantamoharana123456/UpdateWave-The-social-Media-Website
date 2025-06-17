package com.surya.service;

import java.util.List;

import com.surya.exception.ChatException;
import com.surya.exception.MessageException;
import com.surya.exception.UserException;
import com.surya.model.Message;
import com.surya.request.SendMessageRequest;

public interface MessageService  {
	
	public Message sendMessage(SendMessageRequest req) throws UserException, ChatException;
	
	public List<Message> getChatsMessages(Integer chatId) throws ChatException;
	
	public Message findMessageById(Integer messageId) throws MessageException;
	
	public String deleteMessage(Integer messageId) throws MessageException;

}
