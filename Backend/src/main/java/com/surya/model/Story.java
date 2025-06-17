package com.surya.model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name="stories")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Story {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter
	@Setter
	private Integer id;
	
	@ManyToOne
	private User user;
	
	@NotNull
	private String image;
	private String captions;
	private LocalDateTime timestamp;

	public Story setUser(User user) {
		this.user = user;
		return this;
	}

	public Story setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
		return this;
	}
}
