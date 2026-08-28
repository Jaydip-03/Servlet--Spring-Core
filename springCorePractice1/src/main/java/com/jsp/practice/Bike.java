package com.jsp.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.core.Developer;


@Component
public class Bike {
	
	
	@Autowired
	public Bike(Developer dev) {
		System.out.println("Bike no args comstructor : ");
		
	}
	
	public void ride() {
		System.out.println("bike is riding");
	}
	
	
	


}
