package com.jsp.Books;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		
		ApplicationContext a = new AnnotationConfigApplicationContext(Config.class);
		Book b = a.getBean(Book.class);
		System.out.println(b);
		
		Database d = a.getBean(Database.class);
		System.out.println(d);
	}

}
