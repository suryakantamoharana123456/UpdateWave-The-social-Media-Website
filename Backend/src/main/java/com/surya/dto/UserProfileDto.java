package com.surya.dto;

import java.util.ArrayList;
import java.util.List;


import com.surya.model.User;


import lombok.Data;

@Data
public class UserProfileDto {

	private Integer id;
	private String username;
	private String email;
	private String firstName;
	private String lastName;
	private String mobile;
	private String website;
	private String bio;
	private String gender;
	private String image;
	
	private List<UserDto> follower = new ArrayList<>();
	
	private List<User> following = new ArrayList<>();

	private List<StoryDto> stories = new ArrayList<>();
	
	private List<ReelsDto> reels=new ArrayList<>();

	private List<PostDto> savedPosts = new ArrayList<>();
	
	private List<PostDto> reposts = new ArrayList<>();

	public UserProfileDto setBio(String bio) {
		this.bio = bio;
		return this;
	}

	public UserProfileDto setEmail(String email) {
		this.email = email;
		return this;
	}

	public UserProfileDto setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}



	public UserProfileDto setGender(String gender) {
		this.gender = gender;
		return this;
	}

	public UserProfileDto setId(Integer id) {
		this.id = id;
		return this;
	}

	public UserProfileDto setImage(String image) {
		this.image = image;
		return this;
	}

	public UserProfileDto setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public UserProfileDto setMobile(String mobile) {
		this.mobile = mobile;
		return this;
	}



	public UserProfileDto setReposts(List<PostDto> reposts) {
		this.reposts = reposts;
		return this;
	}

	public UserProfileDto setSavedPosts(List<PostDto> savedPosts) {
		this.savedPosts = savedPosts;
		return this;
	}

	public UserProfileDto setWebsite(String website) {
		this.website = website;
		return this;
	}
}
