package com.xworkz.objectmethods.equality;

public class Belt {

	private float price;
	private String material;
	private int size;
	private String gender;

	public Belt() {
		System.out.println("invoked no args const in Belt");
	}

	@Override // material====gender ->equals(string to string)
	public boolean equals(Object obj) {
		System.out.println("invoked equals from belt");
		if (obj != null) {
			System.out.println("ref is not null");
			if (obj instanceof Belt)

			{
				System.out.println("ref is  Belt");
				Belt casted = (Belt) obj;
				String castedMaterial = casted.getMaterial();
				String castedGender = casted.getGender();
				if (this.material.equals(castedMaterial) && this.gender.equals(castedGender)) {
					System.out.println("material and gender is matching");
					return true;
				} else {
					System.err.println("material or gender is not matching");
				}

			} else {
				System.err.println("i cannot compare, ref is not a  Belt");
			}
		} else {
			System.err.println("ref is null pass proper ref");
		}
		return false;

	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
