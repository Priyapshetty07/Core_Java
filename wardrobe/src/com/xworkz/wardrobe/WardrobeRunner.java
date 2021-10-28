package com.xworkz.wardrobe;

import com.xworkz.wardrobe.operator.WardrobeOperator;

public class WardrobeRunner {
	public static void main(String[] args) {

		WardrobeOperator wardrobe = new WardrobeOperator();

		wardrobe.add(" Top");
		wardrobe.add(" T-shirt");
		wardrobe.add(" Kurtha");
		wardrobe.add(" Pant");
		wardrobe.add(" Saree");
		wardrobe.add(" Salwar");

		//		boolean check = wardrobe.add("shoes");
		//		System.out.println(check);

		wardrobe.update(0, " duppattas");
		wardrobe.update(1, " chudidar");

		wardrobe.match("Kurtha");
		wardrobe.match("Salwar");

		wardrobe.delete(2);
		boolean deletedThing = wardrobe.delete(2);
		System.out.println("is thing deleted :".concat(String.valueOf(deletedThing)));
	}
}
