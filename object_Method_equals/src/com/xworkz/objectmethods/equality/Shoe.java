package com.xworkz.objectmethods.equality;

public class Shoe {

	private String brand;
	private int size;
	private String color;
	private String gender;

	public Shoe() {
		System.out.println("invoked no args const in Shoe");
	}

	@Override // brand====gender->equals(string to string)
	public boolean equals(Object obj) {
		System.out.println("invoked equals from Shoe");

		if (obj != null) {
			System.out.println("ref is not null");
			if (obj instanceof Shoe)

			{
				System.out.println("ref is Shoe");
				Shoe casted = (Shoe) obj;
				String castedBrand = casted.getBrand();
				String castedGender = casted.getGender();
				if (this.brand.equals(castedBrand) && this.gender.equals(castedGender)) {
					System.out.println("Emails and Name is matching");
					return true;
				} else {
					System.err.println("Email or Name is not matching");
				}

			} else {
				System.err.println("i cannot compare, ref is not a Shoe");
			}
		} else {
			System.err.println("ref is null pass proper ref");
		}
		return false;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
