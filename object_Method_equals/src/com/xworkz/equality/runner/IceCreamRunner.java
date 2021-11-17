package com.xworkz.equality.runner;

import com.xworkz.equality.enums.IceCreamFlavour;
import com.xworkz.equality.enums.IceCreamType;
import com.xworkz.objectmethods.equality.IceCream;

public class IceCreamRunner {

	public static void main(String[] args) {

		IceCream icecream = new IceCream();
		icecream.setFlavour(IceCreamFlavour.TENDER_COCONUT);
		icecream.setType(IceCreamType.CUP);
		icecream.setName("Naturals");

		IceCream icecream1 = new IceCream();
		icecream1.setFlavour(IceCreamFlavour.KIWI);
		icecream1.setType(IceCreamType.CUP);
		icecream1.setName("Naturals");

		if (icecream == icecream1) {
			System.out.println("both pointing to same memory");
		}
		boolean same = icecream.equals(icecream1);
		System.out.println(same);

	}

}
