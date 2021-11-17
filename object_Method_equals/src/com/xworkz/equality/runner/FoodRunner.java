package com.xworkz.equality.runner;

import com.xworkz.objectmethods.equality.Food;

public class FoodRunner {

	public static void main(String[] args) {

		Food food = new Food();
		food.setName("Chicken Biriyani");
		food.setPrice(499.1f);
		food.setQuantity(2);
		food.setQuality("Good");
//		food.toString();
//		food.hashCode();
//		System.out.println(food.toString());
//		System.out.println(food.hashCode());

		Food food1 = new Food();
		food1.setName("Chicken Biriyani");
		food1.setPrice(499.1f);
		food1.setQuantity(5);
		food1.setQuality("Nice");

		if (food == food1) {
			System.out.println("both pointing to same memory");
		}
		// NAME--PRICE = equals
		boolean same = food.equals(food1);
		{
			System.out.println(same);
		}
	}

}
