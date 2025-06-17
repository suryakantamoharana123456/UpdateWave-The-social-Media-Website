package com.surya.model;

import java.util.ArrayList;
import java.util.List;

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
@Table(name="Chats")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Chat {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter
	@Setter
	private Integer id;
	private String chat_name;
	private String chat_image;
	
	private Boolean is_group;
	
	@ManyToOne
	private User created_by;
	
	@ManyToMany
	private List<User> users = new ArrayList<>();
 
//	@JsonIgnore
	@OneToMany( mappedBy = "chat")
	private List<Message> messages = new ArrayList<>();
////////////////////////////////////////////////////////////////////////////////////
	public List<User> getUsers() {
		return users;
	}

	public Chat setUsers(List<User> users) {
		this.users = users;
		return this;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public Chat setChat_name(String chat_name) {
		this.chat_name = chat_name;
		return this;
	}

	public Chat setIs_group(Boolean is_group) {
		this.is_group = is_group;
		return this;
	}

	public Chat setCreated_by(User created_by) {
		this.created_by = created_by;
		return this;
	}

	public Integer getId() {
		return id;
	}

	public User getCreated_by() {
		return created_by;
	}

	public Boolean getIs_group() {
		return is_group;
	}

	public Chat setChat_image(String chat_image) {
		this.chat_image = chat_image;
		return this;
	}

	public String getChat_image() {
		return chat_image;
	}
}
