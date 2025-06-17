package com.surya.model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter
	@Setter
	private Integer id;
	private String content;
	private String image;
	
	private LocalDateTime timeStamp;
	private Boolean is_read;
	
	@ManyToOne
	private User user;
	
	@ManyToOne
//	@JoinColumn(name="chat_id")
	private Chat chat;


	public Integer getId() {
		return id;
	}

	public Message setImage(String image) {
		this.image = image;
		return this;
	}

	public Message setUser(User user) {
		this.user = user;
		return this;
	}

	public Message setIs_read(Boolean is_read) {
		this.is_read = is_read;
		return this;
	}

	public Message setChat(Chat chat) {
		this.chat = chat;
		return this;
	}

	public Message setContent(String content) {
		this.content = content;
		return this;
	}

	public Message setId(Integer id) {
		this.id = id;
		return this;
	}

	public Message setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
		return this;
	}

	public User getUser() {
		return user;
	}

	public String getContent() {
		return content;
	}

	public Boolean getIs_read() {
		return is_read;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public String getImage() {
		return image;
	}
}
