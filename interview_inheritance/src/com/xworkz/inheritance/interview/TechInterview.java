package com.xworkz.inheritance.interview;

public class TechInterview extends Interview {

	// super() , super--->memebrs of parent class
	public TechInterview() {
		super();
		System.out.println("invoked no args const with TechInterview");
	}

	public void onlineTest() {
		System.out.println("invoked onlinetest method");
		super.written(); // default,public,protected
		super.teaBreak();

	}

}
