package com.jsp.Hospital;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Hospitalll {
	
	String name ;
	String loc ;
	
	
	public Hospitalll() {
		System.out.println("Hpt is created ");
	}


	public String getName() {
		return name;
	}


	@Value(value = "Marvel Hospital")
	public void setName(String name) {
		this.name = name;
	}


	public String getLoc() {
		return loc;
	}

	
    @Value(value = "New York")
	public void setLoc(String loc) {
		this.loc = loc;
	}


	@Override
	public String toString() {
		return "Hospitalll [name=" + name + ", loc=" + loc + "]";
	}
	
	
	

}
