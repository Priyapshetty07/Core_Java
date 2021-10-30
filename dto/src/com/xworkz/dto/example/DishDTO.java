package com.xworkz.dto.example;

public class DishDTO {
	private String brand;
	private String color;
	private double price;
	private int noOfChannels;
	
	public DishDTO() {
		System.out.println("INVOKED DISH");
	}

	public DishDTO(String brand, String color, double price, int noOfChannels) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.noOfChannels = noOfChannels;
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

	public int getNoOfChannels() {
		return noOfChannels;
	}

	public void setNoOfChannels(int noOfChannels) {
		this.noOfChannels = noOfChannels;
	}
	
	

}
