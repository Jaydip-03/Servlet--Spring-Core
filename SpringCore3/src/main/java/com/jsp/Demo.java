package com.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Autowired
	String str ;
	
	
	public void print() {
		System.out.println("String : " + str);
		System.out.println(str.length());
	}
	
	

}
