package com.surya.model;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter
	@Setter
	private Integer id;
	
	@NotNull
	private String content;
	
	@ManyToOne
	private User user;

	@ManyToMany
	private Set<User> liked= new HashSet<>();
	
	private LocalDateTime createdAt;

	public Set<User> getLiked() {
		return liked;
	}

	public Comments setUser(User user) {
		this.user = user;
		return this;
	}

	public Comments setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
		return this;
	}

	public User getUser() {
		return user;
	}

	public @NotNull String getContent() {
		return content;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public Integer getId() {
		return id;
	}
}
