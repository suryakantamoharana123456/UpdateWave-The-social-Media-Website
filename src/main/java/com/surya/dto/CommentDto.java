package com.surya.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class CommentDto {
	

	private Integer id;
	
	private String content;
	
	private UserDto user;

	private List<UserDto> liked= new ArrayList<>();
	
	private LocalDateTime createdAt;

	public CommentDto setContent(String content) {
		this.content = content;
		return this;
	}

	public CommentDto setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
		return this;
	}

	public CommentDto setId(Integer id) {
		this.id = id;
		return this;
	}

	public CommentDto setLiked(List<UserDto> liked) {
		this.liked = liked;
		return this;
	}

	public CommentDto setUser(UserDto user) {
		this.user = user;
		return this;
	}
}
