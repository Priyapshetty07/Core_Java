package com.xworkz.interfaces.election;

public class PriyaElectionRule implements ElectionRule {

	@Override
	public int validAge() {
		System.out.println("invoked VALID AGE method");

		return 23;
	}

	@Override
	public int wardNo() {
		System.out.println("invoked WARD NUMBER method");
		return 250;
	}

	@Override
	public String address() {
		System.out.println("invoked ADDRESS method");
		return "ashok nagar shimoga";
	}

}
