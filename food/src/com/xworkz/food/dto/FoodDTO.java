package com.xworkz.food.dto;

public class FoodDTO {

	private int id;
	private String name;
	private FoodType type = FoodType.NON_VEG;
	private double price;
	private int quantity;

	public FoodDTO() {
		System.out.println(" invoked food dto");
	}

	public FoodDTO(int id, String name, FoodType type, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
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

	public FoodType getType() {
		return type;
	}

	public void setType(FoodType type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
