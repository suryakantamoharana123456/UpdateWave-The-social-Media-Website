package com.surya.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponse {
	@Getter
	@Setter
	private String jwt;
	private String message;

	public AuthResponse setJwt(String jwt) {
		this.jwt = jwt;
		return this;
	}

	public AuthResponse setMessage(String message) {
		this.message = message;
		return this;
	}
}
