package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Program2 {
	private int id;
	private String name;
	@JsonIgnore
	private int age;
	
	Program2(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Program2(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
}
