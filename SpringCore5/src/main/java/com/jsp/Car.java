package com.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired
	@Qualifier(value = "petrol")
	Engine eng ;
	
	public void move() {
		System.out.println("Car is started to move .. .. ..");
		eng.start();
	}

}
