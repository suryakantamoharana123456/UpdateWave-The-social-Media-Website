package com.surya.request;

import lombok.Data;

@Data
public class SendMessageRequest {
	
	private Integer chatId;
	private Integer userId;
	private String content;
	private String image;


	public String getImage() {
		return image;
	}

	public String getContent() {
		return content;
	}

	public Integer getChatId() {
		return chatId;
	}

	public Integer getUserId() {
		return userId;
	}

	public SendMessageRequest setUserId(Integer userId) {
		this.userId = userId;
		return this;
	}
}
