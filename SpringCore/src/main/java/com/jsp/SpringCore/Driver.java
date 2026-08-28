package com.jsp.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import org.springframework.beans.factory.BeanFactory; 
//import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;

public class Driver {
	
	public static void main(String[] args) {
		
	
//		Resource resource = new ClassPathResource("config.xml");
//
//		BeanFactory bf = new XmlBeanFactory(resource);
//		
//	    bf.getBean(Laptop.class);
		
		
		ApplicationContext ap = new AnnotationConfigApplicationContext(Config.class);
		
//		// Retrieve the Laptop bean from the container
//		Laptop laptop = ap.getBean(Laptop.class);
		
	    
		
	}

}

