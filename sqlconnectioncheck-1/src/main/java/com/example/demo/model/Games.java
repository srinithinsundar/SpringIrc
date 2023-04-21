package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "games")
public class Games {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
@Column(name = "name")
	private String name;
@Column(name = "dev")
	private String dev;
@Column(name = "price")
	private int price;
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
	public Games(String name, String dev, int price) {
		super();
		this.name = name;
		this.dev = dev;
		this.price = price;
	}
	public Games() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDev() {
		return dev;
	}
	public void setDev(String dev) {
		this.dev = dev;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
