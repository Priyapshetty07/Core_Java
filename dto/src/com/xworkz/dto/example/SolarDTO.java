package com.xworkz.dto.example;

public class SolarDTO {
	private String brand;
	private String color;
	private double price;
	private int length;
	private float capacity;
	
	public SolarDTO() {
		System.out.println("INVOKED SOLOR");
	}

	public SolarDTO(String brand, String color, double price, int length, float capacity) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.length = length;
		this.capacity = capacity;
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

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public float getCapacity() {
		return capacity;
	}

	public void setCapacity(float capacity) {
		this.capacity = capacity;
	}
	
	

}
