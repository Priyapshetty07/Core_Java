package com.xworkz.objectmethods.equality;

import com.xworkz.equality.enums.BagColor;

public class Bag {

	int price;
	String section;
	BagColor color;

	public Bag() {
		System.out.println("invoked no args const in Bag");
	}

	@Override // color===section->equals(enum to string)
	public boolean equals(Object obj) {
		System.out.println("invoked equals from bag");
		if (obj != null) {
			System.out.println("ref is not null");
			if (obj instanceof Bag) {
				Bag casted = (Bag) obj;
				BagColor castedColor = casted.getColor();
				String castedSection = casted.getSection();
				if (this.color.equals(castedColor) && this.section.equals(castedSection)) {
					System.out.println("Color and section is Matching");
					return true;
				} else {
					System.err.println("Color or section is not matching");
				}

			} else {
				System.err.println("cannot compare, ref is not a bag");
			}
		} else {
			System.err.println("ref is null pass proper ref");
		}
		return false;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public BagColor getColor() {
		return color;
	}

	public void setColor(BagColor color) {
		this.color = color;
	}

}
