package com.jsp.VariableLevelDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.methodLevelDI.MusicSystem;

@Component
public class Car {
//	@Autowired
//	private Engine eng ;
	
	
	
	private Engine engine ;     // for constuctoe lever
	
	public Car() {
		
	}
//	 
	@Autowired
	public Car(Engine engine) {
		this.engine = engine;
	}
//    
	  

	public void move() {
		engine.start();
		
		System.out.println("Car is movinggg gggg gg");
		System.out.println("Ebgine " + engine);
	    
	}
	
	
	// -------------------------------------------------------------------

	private MusicSystem musicSy ;

	public MusicSystem getMusicSy() {
		return musicSy;
	}
    
	@Autowired
	public void setMusicSy(MusicSystem musicSy) {
		System.out.println("setterb  method is called ");
		this.musicSy = musicSy;
		System.out.println("Music : " + musicSy);
	}
	
	
	
	public void move1() {
		musicSy.music();
		System.out.println("car is movingg gg ggggggg");
		System.out.println("Music : " + musicSy);
	}
	
	
	
	
	

}
