package com.xworkz.equality.runner;

import com.xworkz.objectmethods.equality.Belt;

public class BeltRunner {

	public static void main(String[] args) {

		Belt belt = new Belt();
		belt.setPrice(1500.00f);
		belt.setMaterial("leather");
		belt.setSize(32);
		belt.setGender("female");

		Belt belt1 = new Belt();
		belt1.setPrice(1000.00f);
		belt1.setMaterial("leather");
		belt1.setSize(30);
		belt1.setGender("female");

		if (belt == belt1) {
			System.out.println("both pointing to same memory");
		}

		boolean same = belt.equals(belt1);// TRUE
		{
			System.out.println(same);
		}

	}

}
