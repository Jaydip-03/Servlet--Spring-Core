package com.jsp.EmpCrud.entity;

import javax.persistence. *;

@Entity
public class Employee {
	@Id
	@GeneratedValue
	private int id ;
	private int age ;
	private String name ;
	private String email ;
	private String password ;
	private double salary ;
	private String role ;
	private String skill ;
	
	public Employee() {
		
	}

	public Employee( int age, String name, String email, String password, double salary, String role,
			String skill) {
		super();

		this.age = age;
		this.name = name;
		this.email = email;
		this.password = password;
		this.salary = salary;
		this.role = role;
		this.skill = skill;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", salary=" + salary + ", role=" + role + ", skill=" + skill + "]";
	}
	
	
	
	
	

}
