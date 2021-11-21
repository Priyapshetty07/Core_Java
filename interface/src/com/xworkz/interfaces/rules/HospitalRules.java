package com.xworkz.interfaces.rules;

import com.xworkz.interfaces.example.Hospital;

public class HospitalRules implements Hospital {

	public String register() {
		System.out.println("INVOKED REGISTER");
		return "Registered";
	}

	public double payAdvance() {
		System.out.println("INVOKED PAYADVANCE");
		return 5000;
	}

	public boolean validInsurance() {
		System.out.println("INVOKED VALIDINSURANCE");
		return true;
	}
}
