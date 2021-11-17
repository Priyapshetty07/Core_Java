package com.xworkz.object.methods.getClass;

public class Camer {

	private String brand;
	private int modelNo;
	private double price;
	// private byte warranty;
	private int warranty;

	public Camer() {
		System.out.println("invoked no args const camer");
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals from Camer");
		if (obj != null) {
			System.out.println("Ref is not null");
			if (obj instanceof Camer) {
				System.out.println("Ref is Camer");
				Camer casted = (Camer) obj;
				String castedName = casted.getBrand();
				int castedModelNo = casted.getModelNo();
				double castedPrice = casted.getPrice();

				if (this.brand.equals(castedName) && this.modelNo == castedModelNo && this.price == castedPrice) {
					System.out.println("Brand,ModelNumber and price is matching");
					return true;
				} else {
					System.out.println("Brand,ModelNumber or price is not matching");
				}

			} else {
				System.err.println("cannot compare,ref is not a Camer");
			}
		} else {
			System.err.println("Ref is null,pass proper ref");
		}
		return false;
	}

	public String toString() {
		System.out.println(this.brand);
		System.out.println(this.modelNo);
		System.out.println(this.price);
		System.out.println(this.warranty);
		return "toString-camera";
	}

	public int hashCode() {
		return 200;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

}
