package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		
		ApplicationContext ac= new AnnotationConfigApplicationContext(MyConfig.class) ;
		Mobile m =ac.getBean(Mobile.class) ;
		m.call("AIRTEL");
	}

}
