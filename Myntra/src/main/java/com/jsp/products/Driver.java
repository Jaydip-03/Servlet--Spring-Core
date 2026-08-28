package com.jsp.products;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ap = new AnnotationConfigApplicationContext(Config.class) ;
		Products m = ap.getBean(Products.class);
		System.out.println(m);
	}

}
