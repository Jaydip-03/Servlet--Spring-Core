package com.jsp.headphone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EarBuds {
	
	public EarBuds() {
		System.out.println("buds no arg constructor ");
	}
	
	@Autowired
	Mobile mob;
	
	
	
	public void musicStart() {
		System.out.println("song is playing ");
		mob.id = 10 ;
		mob.name = "Samsung" ;
		mob.connect();	
	}
	
	
	
	
	@Autowired
	String str;
	
	public void print() {
		System.out.println(str);
		System.out.println(str.length());
		
	}

}
