package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.example.Hostel;
import com.xworkz.interfaces.rules.HostelRules;

public class HostelRunner {

	public static void main(String[] args) {

		Hostel hostel = new HostelRules();

		System.out.println(" Hostel Admission: " + hostel.admission());
		System.out.println("Hostel Closing Time: " + hostel.closeTime());
		System.out.println("Hostel Gender: " + hostel.gender());

	}

}
