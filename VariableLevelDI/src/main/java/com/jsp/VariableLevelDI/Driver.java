package com.jsp.VariableLevelDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class) ;
		Car c = ac.getBean(Car.class);
		c.move();
		c.move1();
	}

}
