package com.xworkz.dto.example;

public class BluetoothDTO {
	private String brand;
	private String color;
	private int price;
	private int hZ;
	
	public BluetoothDTO() {
		System.out.println("INVOKED BLUETOOTH");
	}

	public BluetoothDTO(String brand, String color, int price, int hZ) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.hZ = hZ;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int gethZ() {
		return hZ;
	}

	public void sethZ(int hZ) {
		this.hZ = hZ;
	}
	
	

}
