package com.xworkz.woodshop.design;

public class Furniture {

	public String shape;
	private double price = 10000.00;
	float weight;
	protected int quantity;

	public Furniture() {
		super();
		System.out.println("invoked furniture with no-args");
	}

	public Furniture(String shape, float weight) {
		super();
		this.shape = shape;
		this.weight = weight;
		System.out.println("invoked furniture with parameterized");
		System.out.println("PRICE:" + this.price);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
