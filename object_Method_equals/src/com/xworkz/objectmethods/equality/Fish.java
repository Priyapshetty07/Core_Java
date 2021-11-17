package com.xworkz.objectmethods.equality;

import com.xworkz.equality.enums.FishType;

public class Fish {
	private String name;
	FishType type;
	private float price;
	private String color;

	public Fish() {
		System.out.println("invoked no args const in Fish");
	}

	@Override // String color ===type->equals(string to enum)
	public boolean equals(Object obj) {
		System.out.println("invoked equals from Fish");
		if (obj != null) {
			System.out.println("Ref is not null");
			if (obj instanceof Fish) {
				System.out.println("refrence is Fish");
				Fish casted = (Fish) obj;
				String castedName = casted.getName();
				FishType castedFishType = casted.getType();
				String castedColor = casted.getColor();
				if (this.name.equals(castedName) && this.type.equals(castedFishType)
						&& this.color.equals(castedColor)) {
					System.out.println("Type,color and name is matching");
					return true;

				} else {
					System.err.println("Type,color and name is not matching ");
				}
			} else {
				System.err.println("cannot compare, ref is not a fish");
			}
		} else {
			System.err.println("ref is null pass proper ref");
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FishType getType() {
		return type;
	}

	public void setType(FishType type) {
		this.type = type;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
