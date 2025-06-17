package com.surya.request;

import lombok.Data;

@Data
public class SingleChatRequest {
	
	private Integer userId;

	public Integer getUserId() {
		return userId;
	}
}
