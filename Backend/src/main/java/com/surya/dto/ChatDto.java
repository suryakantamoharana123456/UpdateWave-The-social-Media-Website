package com.surya.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class ChatDto {

	private Integer id;
	private String chat_name;
	private String chat_image;
	
	private Boolean is_group;
	
	private List<UserDto> admins= new ArrayList<>();
	
	private UserDto created_by;

	private List<UserDto> users = new ArrayList<>();
	
	private List<MessageDto> messages=new ArrayList<>();



	public ChatDto setChat_image(String chat_image) {
		this.chat_image = chat_image;
		return this;
	}

	public ChatDto setChat_name(String chat_name) {
		this.chat_name = chat_name;
		return this;
	}

	public ChatDto setCreated_by(UserDto created_by) {
		this.created_by = created_by;
		return this;
	}

	public ChatDto setId(Integer id) {
		this.id = id;
		return this;
	}

	public ChatDto setIs_group(Boolean is_group) {
		this.is_group = is_group;
		return this;
	}

	public ChatDto setMessages(List<MessageDto> messages) {
		this.messages = messages;
		return this;
	}

	public ChatDto setUsers(List<UserDto> users) {
		this.users = users;
		return this;
	}
}
