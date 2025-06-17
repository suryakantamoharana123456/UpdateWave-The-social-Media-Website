package com.surya.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
public class Reels {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter
	@Setter
	private Long id;
	private String title;
	private String video;
	
	@ManyToOne
	private User user;

	public String getTitle() {
		return title;
	}

	public Reels setTitle(String title) {
		this.title = title;
		return this;
	}

	public String getVideo() {
		return video;
	}

	public Reels setVideo(String video) {
		this.video = video;
		return this;
	}

	public Reels setUser(User user) {
		this.user = user;
		return this;
	}

	public Long getId() {
		return id;
	}

	public User getUser() {
		return user;
	}
}
