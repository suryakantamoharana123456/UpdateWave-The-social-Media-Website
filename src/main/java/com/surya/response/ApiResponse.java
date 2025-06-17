package com.surya.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse {
	
	private String message;
	private boolean status;

//	public ApiResponse(String messageDeletedSuccessfully, boolean b) {
//		this.message=messageDeletedSuccessfully;
//		this.status=b;
//	}

	public ApiResponse setMessage(String message) {
		this.message = message;
		return this;
	}

	public ApiResponse setStatus(boolean status) {
		this.status = status;
		return this;
	}
}
