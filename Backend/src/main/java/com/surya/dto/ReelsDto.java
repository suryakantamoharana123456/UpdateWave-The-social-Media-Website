package com.surya.dto;

import lombok.Data;

@Data
public class ReelsDto {
	
	private Long id;
	private String title;
	private String video;
	
	private UserDto user;

	public ReelsDto setId(Long id) {
		this.id = id;
		return this;
	}

	public ReelsDto setTitle(String title) {
		this.title = title;
		return this;
	}

	public ReelsDto setUser(UserDto user) {
		this.user = user;
		return this;
	}

	public ReelsDto setVideo(String video) {
		this.video = video;
		return this;
	}
}
