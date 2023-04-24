package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="signup")
public class SignupModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int id;
	@Column(name = "username")
	private String username;
	@Column(name="email")
	private String email;
	@Column(name="phone")
	private String phone;
	@Column(name = "age")
	private String age;
	@Column(name = "password")
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public SignupModel(String username, String email, String phone, String age, String password) {
		super();
		this.username = username;
		this.email = email;
		this.phone = phone;
		this.age = age;
		this.password = password;
	}
	public SignupModel() {
		super();
	}
	
	
	
	
	
	

}
