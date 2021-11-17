package com.xworkz.object.methods.getClass;

import com.xworkz.getClass.enums.SweetColor;
import com.xworkz.getClass.enums.SweetShape;

public class Sweet {

	private String name;
	private SweetColor color;
	private double price;
	private SweetShape shape;

	public Sweet() {
		System.out.println("invoked no args const Sweet");
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals from Sweet");
		if (obj != null) {
			System.out.println("Ref is not null");
			if (obj instanceof Sweet) {
				System.out.println("refrence is Sweet");
				Sweet casted = (Sweet) obj;
				String castedName = casted.getName();
				SweetShape castedShape = casted.getShape();
				SweetColor castedColor = casted.getColor();
				if (this.name.equals(castedName) && this.shape.equals(castedShape) && this.color.equals(castedColor)) {
					System.out.println("name,color and shape matching");
					return true;
				} else {
					System.err.println("name,color and shape  not is matching");
				}
			} else {
				System.err.println("cannot compare,ref is not a Sweet");
			}
		} else {
			System.err.println("Ref is null,pass proper ref");
		}
		return false;
	}

	public String toString() {
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.color);
		System.out.println(this.shape);
		return "Sweet-toString";
	}

	public int hashCode() {
		return 50;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SweetColor getColor() {
		return color;
	}

	public void setColor(SweetColor color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public SweetShape getShape() {
		return shape;
	}

	public void setShape(SweetShape shape) {
		this.shape = shape;
	}

}
