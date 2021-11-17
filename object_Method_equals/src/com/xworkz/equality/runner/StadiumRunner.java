package com.xworkz.equality.runner;

import com.xworkz.objectmethods.equality.Stadium;

public class StadiumRunner {

	public static void main(String[] args) {

		Stadium stadium = new Stadium();
		stadium.setName("M.Chinnaswamy Stadium");
		stadium.setCity("Banglore");
		stadium.setAreaOfMeters(64749.703);

		Stadium stadium1 = new Stadium();
		stadium1.setName("M.Chinnaswamy Stadium");
		stadium1.setCity("Udupi");
		stadium1.setAreaOfMeters(64749.703);

		if (stadium == stadium1) {
			System.out.println("both pointing to same memory");
		}

		boolean same = stadium.equals(stadium1);// TRUE
		{
			System.out.println(same);
		}

	}

}
