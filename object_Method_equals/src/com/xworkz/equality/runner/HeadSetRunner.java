package com.xworkz.equality.runner;

import com.xworkz.equality.enums.HeadSetTypes;
import com.xworkz.objectmethods.equality.HeadSet;

public class HeadSetRunner {

	public static void main(String[] args) {

		HeadSet headSet = new HeadSet();
		headSet.setBrand("Apple");
		headSet.setBattery(56.50f);
		headSet.setType(HeadSetTypes.WIRLESS);
		headSet.setWarranty(2);

		HeadSet headSet1 = new HeadSet();
		headSet1.setBrand("Apple");
		headSet1.setBattery(56.50f);
		headSet1.setType(HeadSetTypes.WIRE);
		headSet1.setWarranty(2);

		if (headSet == headSet1) {
			System.out.println("pointing to same location");
		}

		boolean same = headSet.equals(headSet1);
		System.out.println(same);
	}
}
