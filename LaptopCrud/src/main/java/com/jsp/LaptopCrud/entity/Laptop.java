package com.jsp.LaptopCrud.entity;

import javax.persistence.*;

@Entity
public class Laptop {
	@Id
	@GeneratedValue
	private int id ;
	private String name ;
	private double price ;
	private String ram ;
	private String rom ;
	private String version ;
	private String color ;
	private String weight ;
	
	
	public Laptop() {
		
	}


	public Laptop(String name, double price, String ram, String rom, String version, String color, String weight) {
		super();
		this.name = name;
		this.price = price;
		this.ram = ram;
		this.rom = rom;
		this.version = version;
		this.color = color;
		this.weight = weight;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getRam() {
		return ram;
	}


	public void setRam(String ram) {
		this.ram = ram;
	}


	public String getRom() {
		return rom;
	}


	public void setRom(String rom) {
		this.rom = rom;
	}


	public String getVersion() {
		return version;
	}


	public void setVersion(String version) {
		this.version = version;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getWeight() {
		return weight;
	}


	public void setWeight(String weight) {
		this.weight = weight;
	}


	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", price=" + price + ", ram=" + ram + ", rom=" + rom
				+ ", version=" + version + ", color=" + color + ", weight=" + weight + "]";
	}
	
	
	
	

}
