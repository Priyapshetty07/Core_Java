package com.xworkz.objectmethods.equality;

import com.xworkz.equality.enums.HeadSetTypes;

public class HeadSet {

	private String brand;
	private HeadSetTypes type;
	private float battery;
	private int warranty;

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals from HeadSet");
		if (obj != null) {
			System.out.println("ref is not null");
			if (obj instanceof HeadSet) {
				System.out.println("refrence is Headset");
				HeadSet casted = (HeadSet) obj;
				String castedBrand = casted.getBrand();
				float castedBattery = casted.getBattery();
				if (this.brand.equals(castedBrand) && this.battery == castedBattery) {
					System.out.println("Brand and Battery is matching");
					return true;
				} else {
					System.err.println("Brand and Battery is not matching");
				}
			} else {
				System.err.println("cannot compare, ref is not a HeadSet");
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

	public HeadSetTypes getType() {
		return type;
	}

	public void setType(HeadSetTypes type) {
		this.type = type;
	}

	public float getBattery() {
		return battery;
	}

	public void setBattery(float battery) {
		this.battery = battery;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

}