package com.jsp.Marker;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
	
		ApplicationContext a = new AnnotationConfigApplicationContext(Config.class) ;
		Markerrr m = a.getBean(Markerrr.class) ;
		System.out.println(m);
	}

}
