package com.xworkz.dto.example;

public class StatueDTO {
	private String brand;
	private String color;
	private double price;
	private float size;
	
	public StatueDTO() {
		System.out.println("INVOKED STATUE");
	}

	public StatueDTO(String brand, String color, double price, float size) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.size = size;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}
	
	

}
