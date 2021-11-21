package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.example.Hospital;
import com.xworkz.interfaces.rules.HospitalRules;

public class HospitalRunner {

	public static void main(String[] args) {

		Hospital hospital = new HospitalRules();

		System.out.println(" Hospital Registration Status: " + hospital.register());
		System.out.println("Hospital Advance Status: " + hospital.payAdvance());
		System.out.println("Hospital Insurance: " + hospital.validInsurance());

	}

}
