package com.xworkz.dto.example;

public class ChargerDTO {
	private String brand;
	private String color;
	private double price;
	private int port;
	
	public ChargerDTO() {
		System.out.println("INVOKED CHARGER");
	}

	public ChargerDTO(String brand, String color, double price, int port) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.port = port;
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

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	

}
