package com.jsp.StudentCrud.entity;
import javax.persistence. *;

@Entity 
public class Student {
	
	@Id
	@GeneratedValue
	private int id ;
	private String name ;
	private String email ;
	private int marks ;
	private String deparment ;
	
	
	public Student() {
		
	}


	public Student(String name, String email, int marks, String deparment) {
		super();
		this.name = name;
		this.email = email;
		this.marks = marks;
		this.deparment = deparment;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public String getDeparment() {
		return deparment;
	}


	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", marks=" + marks + ", deparment="
				+ deparment + "]";
	}
	
	
	
	
	
	
	
	

}
