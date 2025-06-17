package com.surya.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class PostDto {
	

	private Integer id;
	
	private String caption;
	
	private String image;

	private LocalDateTime createdAt;
	
	private UserDto user;
	
	private List<CommentDto> comments=new ArrayList<>();
	
	private List<UserDto> liked= new ArrayList<>(); 
	
	private boolean likedByRequser;
	
	private boolean savedByRequser;

	public PostDto setCaption(String caption) {
		this.caption = caption;
		return this;
	}

	public PostDto setComments(List<CommentDto> comments) {
		this.comments = comments;
		return this;
	}

	public PostDto setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
		return this;
	}

	public PostDto setId(Integer id) {
		this.id = id;
		return this;
	}

	public PostDto setImage(String image) {
		this.image = image;
		return this;
	}

	public PostDto setLiked(List<UserDto> liked) {
		this.liked = liked;
		return this;
	}

	public PostDto setLikedByRequser(boolean likedByRequser) {
		this.likedByRequser = likedByRequser;
		return this;
	}

	public PostDto setSavedByRequser(boolean savedByRequser) {
		this.savedByRequser = savedByRequser;
		return this;
	}

	public PostDto setUser(UserDto user) {
		this.user = user;
		return this;
	}
}
