package com.jsp.Cars;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		
		ApplicationContext a = new AnnotationConfigApplicationContext(Config.class) ;
		Car c = a.getBean(Car.class);
		System.out.println(c);
	}

}
