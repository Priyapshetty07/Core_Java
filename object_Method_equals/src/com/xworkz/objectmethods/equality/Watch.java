package com.xworkz.objectmethods.equality;

import com.xworkz.equality.enums.WatchType;

public class Watch {

	private String brand;
	WatchType type;
	private int price;

	public Watch() {
		System.out.println("invoked no args const in Watch");
	}
@Override //brand====type->equals(string to enum)
	public boolean equals(Object obj) {
		System.out.println("invoked equals from watch ");
		if (obj != null) {
			System.out.println("Ref is not null");
			if (obj instanceof Watch) {
				Watch caste = (Watch) obj;
				String castedBrand = caste.getBrand();
				WatchType castedtype = caste.getType();

				if (this.brand.equals(castedBrand) && this.type.equals(castedtype)){
					System.out.println("Brand and Type is Matching");
					return true;

				} else {
					System.err.println("Brand or Type is not matching ");
				}
			} else {
				System.err.println("cannot compare, ref is not a watch");
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

	public WatchType getType() {
		return type;
	}

	public void setType(WatchType type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
