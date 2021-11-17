package com.xworkz.equality.runner;

import com.xworkz.equality.enums.WatchType;
import com.xworkz.objectmethods.equality.Watch;

public class WatchRunner {

	public static void main(String[] args) {

		Watch watch = new Watch();
		watch.setBrand("IWatch");
		watch.setPrice(60000);
		watch.setType(WatchType.SMARTWATCH);

		Watch watch1 = new Watch();
		watch1.setBrand("IWatch");
		watch1.setPrice(2500);
		watch1.setType(WatchType.SMARTWATCH);
		if (watch == watch1) {
			System.out.println("both pointing to same memory");
		}

		boolean same = watch.equals(watch1);
		{
			System.out.println(same);
		}
	}
}
