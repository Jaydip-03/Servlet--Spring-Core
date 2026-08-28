package com.jsp.core;

import org.springframework.context.ApplicationContext; 
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.noUnicdefHandle.Transaction;

public class Driver {
	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class) ;
		
		Developer bean = ac.getBean(Developer.class) ;
		bean.display() ;
		
		Transaction bean2 = ac.getBean(Transaction.class) ;
		bean2.done();
	}

}
