package com.surya.request;

import java.util.List;

import lombok.Data;

@Data
public class GroupChatRequest {
	
	private List<Integer> userIds;
	private String chat_name;
	private String chat_image;

	public String getChat_name() {
		return chat_name;
	}

	public String getChat_image() {
		return chat_image;
	}

	public List<Integer> getUserIds() {
		return userIds;
	}
}
