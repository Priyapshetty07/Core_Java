package com.xworkz.objectmethods.equality;

public class Stadium {

	private String name;
	private String city;
	private double areaOfMeters;

	public Stadium() {
		System.out.println("invoked no args const in Stadium");
	}

	// name===areaOfMeters->equals(string to double)
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals from Stadium");

		if (obj != null) {
			System.out.println("ref is not null");
			if (obj instanceof Stadium)

			{
				System.out.println("ref is Stadium");
				Stadium casted = (Stadium) obj;
				String castedStadiumName = casted.getName();
				double castedStadiumAreaOfMeters = casted.getAreaOfMeters();
				if (this.name.equals(castedStadiumName) && this.areaOfMeters == castedStadiumAreaOfMeters) {
					System.out.println("Name and AreaOfMeters is matching");
					return true;
				} else {
					System.err.println("Name or AreaOfMetersis not matching");
				}

			} else {
				System.err.println("i cannot compare, ref is not a Stadium");
			}
		} else {
			System.err.println("ref is null pass proper ref");
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getAreaOfMeters() {
		return areaOfMeters;
	}

	public void setAreaOfMeters(double areaOfMeters) {
		this.areaOfMeters = areaOfMeters;
	}

}
