package com.jsp.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.practice.Bike;

@Component
public class Laptop {
	
	public Laptop() {
		System.out.println("call laptop no args constructor ");
	}
	
	
	
	
	
	private Bike b;
	
	@Autowired
	public Laptop(Bike b) {
		this.b = b ;	
	}
	
	
	public void excutuProram() {
		System.out.println("Program exucutes on laptop : ");
		
		b.ride();
	}
	


}
