package com.jsp.Pets;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pet {
	@Value(value = "${p.name}")
	String name ;
	@Value(value = "${p.weight}")
	String weight ;
	
	
	
	@Override
	public String toString() {
		return "Pet [name=" + name + ", weight=" + weight + "]";
	}
	
	
	
}
