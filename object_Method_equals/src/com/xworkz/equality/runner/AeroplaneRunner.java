package com.xworkz.equality.runner;

import com.xworkz.objectmethods.equality.Aeroplane;

public class AeroplaneRunner {

	public static void main(String[] args) {

		Aeroplane aeroplane = new Aeroplane();
		aeroplane.setNumber(261);
		aeroplane.setCompany("IndiGO");
		aeroplane.setGovernment("India");

		Aeroplane aeroplane1 = new Aeroplane();
		aeroplane1.setNumber(260);
		aeroplane1.setCompany("IndiGO");
		aeroplane1.setGovernment("India");

		if (aeroplane == aeroplane1) {
			System.out.println("both pointing to same memory");
		}

		boolean same = aeroplane.equals(aeroplane1);
		{
			System.out.println(same);
		}
	}

}
