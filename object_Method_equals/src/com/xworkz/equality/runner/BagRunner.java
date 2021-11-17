package com.xworkz.equality.runner;

import com.xworkz.equality.enums.BagColor;
import com.xworkz.objectmethods.equality.Bag;

public class BagRunner {

	public static void main(String[] args) {

		Bag bag = new Bag();
		bag.setColor(BagColor.BLACK);
		bag.setPrice(500);
		bag.setSection("Laptop");

		Bag bag1 = new Bag();
		bag1.setColor(BagColor.BLACK);
		bag1.setPrice(100);
		bag1.setSection("Laptop");

		boolean same = bag.equals(bag1);
		{
			System.out.println(same);
		}
	}

}
