package com.jsp.products;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Products {
	String name;
	String brand;
	double price;
	public Products() {
		
	}
	public Products(String name, String brand, double price) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	
	@Value(value="${products.name}")
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	@Value(value="${products.brand}")
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	@Value(value="${products.price}")
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Products [name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	
	
	
}
