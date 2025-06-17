package com.surya.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	private Integer id;

	private String username;
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@Getter
	@Setter
	private String password;
	private String email;
	private String firstName;
	private String lastName;
	private String mobile;
	private String website;
	private String bio;
	private String gender;
	private String image;
	
	@JsonIgnore
	@ManyToMany
	private Set<User> follower = new HashSet<>();
	
	@JsonIgnore
	@ManyToMany(mappedBy = "follower",fetch = FetchType.LAZY)
	private Set<User> following = new HashSet<User>();

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Story> stories = new ArrayList<>();

	@JsonIgnore
	@ManyToMany
	private List<Post> savedPosts = new ArrayList<>();
	
	@JsonManagedReference
	@JsonIgnore
	@ManyToMany
	private List<Post> reposts = new ArrayList<>();
	
	@JsonBackReference
	@JsonIgnore
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
	private List<Notification> notifications=new ArrayList<>();


	/////////////////////////////////////////////////////////////////


	public String getFirstName() {
		return firstName;
	}



	public Integer getId() {
		return id;
	}

	public List<Post> getSavedPosts() {
		return savedPosts;
	}

	public String getLastName() {
		return lastName;
	}

	public String getBio() {
		return bio;
	}

	public String getEmail() {
		return email;
	}
	public String getImage() {
		return image;
	}
	public String getPassword() {
		return password;
	}
	public String getMobile() {
		return mobile;
	}
	public String getWebsite() {
		return website;
	}
	public String getGender() {
		return gender;
	}


	public User setEmail(String email) {
		this.email = email;
		return this;
	}

	public User setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public User setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public User setPassword(String password) {
		this.password = password;
		return this;
	}

	public Set<User> getFollower() {
		return follower;
	}

	public Set<User> getFollowing() {
		return following;
	}

	public User setBio(String bio) {
		this.bio = bio;
		return this;
	}

	public User setMobile(String mobile) {
		this.mobile = mobile;
		return this;
	}

	public User setGender(String gender) {
		this.gender = gender;
		return this;
	}

	public User setWebsite(String website) {
		this.website = website;
		return this;
	}

	public User setImage(String image) {
		this.image = image;
		return this;
	}

	public List<Story> getStories() {
		return stories;
	}

	public List<Post> getReposts() {
		return reposts;
	}
}
