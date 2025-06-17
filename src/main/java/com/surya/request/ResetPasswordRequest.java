package com.surya.request;

import lombok.Data;

@Data
public class ResetPasswordRequest {
	
	private String password;
	private String token;

	public String getToken() {
		return token;
	}

	public String getPassword() {
		return password;
	}
}
