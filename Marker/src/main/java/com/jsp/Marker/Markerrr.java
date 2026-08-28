package com.jsp.Marker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Markerrr {
	 private String  brand ;
     private String color ;
	 private double   price ;
	
	
	
	public Markerrr(@Value(value = "${m.brand}") String brand,
			        @Value(value = "${m.color}") String color, 
			        @Value(value = "${m.price}") double price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}



	@Override
	public String toString() {
		return "Markerrr [brand=" + brand + ", color=" + color + ", price=" + price + "]";
	}
	
	
	 
	
	

}
