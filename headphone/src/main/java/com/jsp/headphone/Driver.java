package com.jsp.headphone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		
//		ApplicationContext ac= new ClassPathXmlApplicationContext("spring.xml") ;
//		EarBuds e = ac.getBean(EarBuds.class) ;
		
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
		EarBuds e = ac.getBean(EarBuds.class);
		e.musicStart();
		e.print();
		
		
		
		// -----------------------------
		
		
	}

}
