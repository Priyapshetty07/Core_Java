package com.xworkz.objectmethods.equality;

import com.xworkz.equality.enums.SockMaterial;
import com.xworkz.equality.enums.SockType;

public class Sock {

	private char size;
	private double price;
	private SockMaterial material;
	private SockType type;

	public Sock() {
		System.out.println("invoked no args const in Person");
	}

	@Override // SIZE===MATERIALS->EQUALS(CHAR TO ENUM)
	public boolean equals(Object obj) {
		System.out.println("invoked equals from Sock");
		if (obj != null) {
			System.out.println("ref is not null");
			if (obj instanceof Sock) {
				System.out.println("refrence is Sock");
				Sock casted = (Sock) obj;
				char castedsize = casted.getSize();
				SockMaterial castedMaterial = casted.getMaterial();
				if (this.material.equals(castedMaterial) && this.size == castedsize) {
					System.out.println("Size and Material is matching");
					return true;
				} else {
					System.err.println("Size or Material is not matching");
				}

			} else {
				System.err.println("cannot compare, ref is not a Sock");
			}
		} else {
			System.err.println("ref is null pass proper ref");
		}
		return false;
	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public SockMaterial getMaterial() {
		return material;
	}

	public void setMaterial(SockMaterial material) {
		this.material = material;
	}

	public SockType getType() {
		return type;
	}

	public void setType(SockType type) {
		this.type = type;
	}

}
