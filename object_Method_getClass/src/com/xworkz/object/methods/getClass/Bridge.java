package com.xworkz.object.methods.getClass;

public class Bridge {

	private String name;
	private float length;
	private double cost;
	private int openYear;

	public Bridge() {
		System.out.println("invoked no args const Bridge");
	}

	public Bridge(String name, float length, double cost, int openYear) {
		super();
		this.name = name;
		this.length = length;
		this.cost = cost;
		this.openYear = openYear;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals from Bridge");
		if (obj != null) {
			System.out.println("Ref is not null");
			if (obj instanceof Bridge) {
				System.out.println("Ref is Bridge");

				Bridge casted = (Bridge) obj;
				String castedName = casted.getName();
				float castedLength = casted.getLength();
				int castedOpenYear = casted.getOpenYear();

				if (this.name.equals(castedName) && this.length == castedLength && this.openYear == castedOpenYear) {
					System.out.println("Name,Length and openYear is matching");
					return true;
				} else {
					System.out.println("Name,Length or openYear is not matching");
				}

			} else {
				System.err.println("cannot compare,ref is not a Bridge");
			}
		} else {
			System.err.println("Ref is null,pass proper ref");
		}
		return false;
	}

	public String toString() {
		System.out.println(this.name);
		System.out.println(this.length);
		System.out.println(this.cost);
		System.out.println(this.openYear);
		return "String";
	}

	public int hashCode() {
		return 100;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getOpenYear() {
		return openYear;
	}

	public void setOpenYear(int openYear) {
		this.openYear = openYear;
	}
}
