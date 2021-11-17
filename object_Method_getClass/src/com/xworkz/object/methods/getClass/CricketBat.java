package com.xworkz.object.methods.getClass;

import com.xworkz.getClass.enums.CricketBatType;

public class CricketBat {

	private String companyName;
	private CricketBatType type;
	private double price;
	private String wood;

	public CricketBat() {
		System.out.println("invoked no args const CricketBat");
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals from CricketBat");
		if (obj != null) {
			System.out.println("Ref is not null");
			if (obj instanceof CricketBat) {
				System.out.println("Ref is CricketBat");

				CricketBat casted = (CricketBat) obj;
				String castedCompanyName = casted.getCompanyName();
				CricketBatType castedType = casted.getType();
				double castedPrice = casted.getPrice();

				if (this.companyName.equals(castedCompanyName) && this.type.equals(castedType)
						&& this.price == castedPrice) {
					System.out.println("companyName,Type and Price is matching");
					return true;
				} else {
					System.out.println("companyName,Type or Price is not matching");
				}

			} else {
				System.err.println("cannot compare,ref is not a CricketBat");
			}
		} else {
			System.err.println("Ref is null,pass proper ref");
		}
		return false;
	}

	public String toString() {
		System.out.println(this.companyName);
		System.out.println(this.type);
		System.out.println(this.price);
		System.out.println(this.wood);
		return "toString";
	}

	public int hashCode() {
		return 300;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public CricketBatType getType() {
		return type;
	}

	public void setType(CricketBatType type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getWood() {
		return wood;
	}

	public void setWood(String wood) {
		this.wood = wood;
	}

}
