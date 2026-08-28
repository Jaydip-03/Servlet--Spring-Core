package com.jsp.unicrud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class University {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String loc;
	private String email;
	private int rank;
	private String type;
	
	public University() {
		// TODO Auto-generated constructor stub
	}

	public University(String name, String loc, String email, int rank, String type) {
		this.name = name;
		this.loc = loc;
		this.email = email;
		this.rank = rank;
		this.type = type;
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

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
