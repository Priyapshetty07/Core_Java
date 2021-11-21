package com.xworkz.interfaces.rules;

import com.xworkz.interfaces.example.Hostel;

public class HostelRules implements Hostel {

	public boolean admission() {
		System.out.println("INVOKED ADMISSION");
		return true;
	}

	public double closeTime() {
		System.out.println("INVOKED CLOSETIME");
		return 6.30;
	}

	public String gender() {
		System.out.println("INVOKED GENDER");
		return "FEMALE";
	}

}
