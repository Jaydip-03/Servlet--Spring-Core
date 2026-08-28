package com.jsp.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.practice.Bike;

@Component
public class Developer {
	
	@Autowired
	private Laptop laptop;
	
	void display() {
		System.out.println("Developer develop program");
		laptop.excutuProram() ;
	}
	
	

}
