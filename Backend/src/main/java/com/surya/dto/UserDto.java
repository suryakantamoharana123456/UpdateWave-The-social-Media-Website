package com.surya.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {
	

	private String firstName;
	private String lastName;
	private String email;
	private Integer id;
	private String image;

	public UserDto setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public UserDto setId(Integer id) {
		this.id = id;
		return this;
	}

	public UserDto setImage(String image) {
		this.image = image;
		return this;
	}

	public UserDto setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
}
