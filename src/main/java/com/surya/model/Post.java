package com.surya.model;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="posts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter
	@Setter
	private Integer id;
	private String caption;
	
	private String image;
	
	private String video;
	
	private String location;
	
	private LocalDateTime createdAt;
	
	@ManyToOne
	private User user;
	
	@OneToMany
	private List<Comments> comments=new ArrayList<Comments>();
	
	@ManyToMany
	private Set<User> liked= new HashSet<>();


	public Integer getId() {
		return id;
	}

	public Set<User> getLiked() {
		return liked;
	}

	public User getUser() {
		return user;
	}

	public String getCaption() {
		return caption;
	}

	public Post setCaption(String caption) {
		this.caption = caption;
		return this;
	}

	public String getImage() {
		return image;
	}

	public Post setImage(String image) {
		this.image = image;
		return this;
	}

	public String getVideo() {
		return video;
	}

	public Post setVideo(String video) {
		this.video = video;
		return this;
	}

	public Post setUser(User user) {
		this.user = user;
		return this;
	}

	public Post setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
		return this;
	}

	public List<Comments> getComments() {
		return comments;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
}
