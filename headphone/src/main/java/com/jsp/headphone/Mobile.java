package com.jsp.headphone;

import org.springframework.stereotype.Component;

@Component
public class Mobile {
	
	String name ;
	int id ;
	
	public Mobile() {
		System.out.println("mobile no args const");
	}
	
	Mobile(String name , int id ) {
		this.id = id ;
		this.name = name ;
	}
	
	
	public void connect() {
		System.out.println("mobile is connected ");
		System.out.println("name : " + name);
		System.out.println("is : " + id);
	}

}
