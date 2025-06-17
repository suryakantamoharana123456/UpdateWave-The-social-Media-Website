package com.surya.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class MessageDto {

	private String content;
	private String image;
	private Integer id;
	private LocalDateTime timeStamp;
	private Boolean is_read;
	private UserDto user;
	private ChatDto chat;

	public MessageDto setContent(String content) {
		this.content = content;
		return this;
	}

	public MessageDto setId(Integer id) {
		this.id = id;
		return this;
	}

	public MessageDto setImage(String image) {
		this.image = image;
		return this;
	}

	public MessageDto setIs_read(Boolean is_read) {
		this.is_read = is_read;
		return this;
	}

	public MessageDto setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
		return this;
	}

	public MessageDto setUser(UserDto user) {
		this.user = user;
		return this;
	}
}
