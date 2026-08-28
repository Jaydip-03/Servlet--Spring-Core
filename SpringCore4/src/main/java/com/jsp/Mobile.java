package com.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	@Autowired
	Sim sim ;
	
	
	public void call(String persone) {
		System.out.println( persone + " :  ");
		System.out.println("Mobile is calling to " + sim);
		sim.simName("jio");
	}

}
