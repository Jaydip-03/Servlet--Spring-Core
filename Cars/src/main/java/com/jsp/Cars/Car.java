package com.jsp.Cars;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	private String brand ;
	private String color ;
	private double price ;
	
	public Car( @Value(value = "Bmw") String  brand,
			    @Value(value = "balck") String color,
			    @Value(value = "100000") double price) {
		
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", price=" + price + "]";
	}
	
	
	
	
	

}
