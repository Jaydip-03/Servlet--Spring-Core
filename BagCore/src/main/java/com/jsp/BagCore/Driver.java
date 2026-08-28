package com.jsp.BagCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Driver {
	public static void main(String[] args) {
		
		ApplicationContext ap = new AnnotationConfigApplicationContext(Config.class);
		

	}

}

