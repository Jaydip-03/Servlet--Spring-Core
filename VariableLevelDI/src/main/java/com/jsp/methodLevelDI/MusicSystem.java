package com.jsp.methodLevelDI;

import org.springframework.stereotype.Component;

@Component
public class MusicSystem {
	
	public void music() {
		System.out.println("Music is playingggg");
	}

}
