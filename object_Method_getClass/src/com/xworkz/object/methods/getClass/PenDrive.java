package com.xworkz.object.methods.getClass;

public class PenDrive {

	private String capacity;
	private boolean working;
	private String brand;
	private float price;

	public PenDrive() {
		System.out.println("invoked no args const PenDrive");
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals from PenDrive");
		if (obj != null) {
			System.out.println("Ref is not null");
			if (obj instanceof PenDrive) {
				System.out.println("Ref is PenDrive");

				PenDrive casted = (PenDrive) obj;
				String castedCapacity = casted.getCapacity();
				boolean castedWorking = casted.isWorking();
				float castedPrice = casted.getPrice();

				if (this.capacity.equals(castedCapacity) && this.working == castedWorking
						&& this.price == castedPrice) {
					System.out.println("capacity,working and price is matching");
					return true;
				} else {
					System.out.println("capacity,working or price is not matching");
				}

			} else {
				System.err.println("cannot compare,ref is not a PenDrive");
			}
		} else {
			System.err.println("Ref is null,pass proper ref");
		}
		return false;
	}

	public String toString() {
		System.out.println(this.capacity);
		System.out.println(this.working);
		System.out.println(this.brand);
		System.out.println(this.price);
		return "toString-pendrive";
	}

	public int hashCode() {
		return 200;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean working) {
		this.working = working;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
