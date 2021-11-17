package com.xworkz.objectmethods.equality;

public class Aeroplane {

	private int number;
	private String company;
	private String government;

	public Aeroplane() {
		System.out.println("invoked no args const in Aeroplane");
	}

	@Override // company to government(string to string)
	public boolean equals(Object obj) {
		System.out.println("invoked equals from Aeroplane");
		if (obj != null) {
			System.out.println("ref is not null");
			if (obj instanceof Aeroplane)

			{
				System.out.println("ref is person");
				Aeroplane casted = (Aeroplane) obj;
				String castedAeroplaneCompany = casted.getCompany();
				String castedAeroplaneGovernment = casted.getGovernment();
				if (this.company.equals(castedAeroplaneCompany) && this.government.equals(castedAeroplaneGovernment)) {
					System.out.println("Company and Government is matching");
					return true;
				} else {
					System.err.println("Company or Government is not matching");
				}

			} else {
				System.err.println("i cannot compare, ref is not a Aeroplane");
			}
		} else {
			System.err.println("ref is null pass proper ref");
		}

		return false;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getGovernment() {
		return government;
	}

	public void setGovernment(String government) {
		this.government = government;
	}

}
