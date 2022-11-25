package com.digitalbooks.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String username;
	private String password;
	private String email;
	private boolean active;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Author(Integer id, String username, String password, String email, boolean active) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.active = active;
	}
	public Author(String username, String password, String email, boolean active) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.active = active;
	}
	public Author() {
		super();
	}
	
	

}
