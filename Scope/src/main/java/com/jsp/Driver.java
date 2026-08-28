package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class) ;
		Laptop l1 = ac.getBean(Laptop.class);
		System.out.println(l1);
	}

}
