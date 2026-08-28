package com.jsp.Pets;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class driver {
	public static void main(String[] args) {
		
		ApplicationContext ap = new AnnotationConfigApplicationContext(Config.class) ;
		Pet p = ap.getBean(Pet.class);
		System.out.println(p);
	}

}
