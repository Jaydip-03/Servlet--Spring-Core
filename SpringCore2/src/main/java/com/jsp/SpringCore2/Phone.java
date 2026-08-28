package com.jsp.SpringCore2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Phone {
	@Value( value = "Apple")
	String name ;
	@Value(value = "10000")
	double value ;
	
	public Phone() {
		System.out.println("Phone is created ");
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", value=" + value + "]";
	}
	
	
	
	

}
