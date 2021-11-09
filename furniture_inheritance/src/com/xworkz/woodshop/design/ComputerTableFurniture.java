package com.xworkz.woodshop.design;

public class ComputerTableFurniture extends Furniture {

	public ComputerTableFurniture() {
		super();
		System.out.println("invoked no-args with ComputerTable");
	}

	public ComputerTableFurniture(String shape, double price, float weight, int quantity) {
		super();
		System.out.println("invoked ComputerTable String,double,float,boolean constructor");
		super.shape = "Round";
		// super.price=price;
		// super.weight=weight;
		super.quantity = 2;
		System.out.println("Quantity:" + quantity);
	}
}
