package com.jsp.bankcrud.entity;

import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bank {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String ISFC;
	private String location;
	
	public Bank() {
		// TODO Auto-generated constructor stub
	}

	public Bank(String name, String iSFC, String location) {
		super();
		this.name = name;
		ISFC = iSFC;
		this.location = location;
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

	public String getISFC() {
		return ISFC;
	}

	public void setISFC(String iSFC) {
		ISFC = iSFC;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", ISFC=" + ISFC + ", location=" + location + "]";
	}
}
