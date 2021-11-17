package com.xworkz.equality.runner;

import com.xworkz.equality.enums.FishType;
import com.xworkz.objectmethods.equality.Fish;

public class FishRunner {

	public static void main(String[] args) {

		Fish fish = new Fish();
		fish.setName("Silver Paplet");
		fish.setType(FishType.SEA_FISH);
		fish.setPrice(850.0f);
		fish.setColor("silver");

		Fish fish1 = new Fish();
		fish1.setName("Silver Paplet");
		fish1.setType(FishType.SEA_FISH);
		fish1.setPrice(950.0f);
		fish1.setColor("silver");

		if (fish == fish1) {
			System.out.println("both pointing to same memory");
		}
		boolean same = fish.equals(fish1);
		System.out.println(same);
	}
}
