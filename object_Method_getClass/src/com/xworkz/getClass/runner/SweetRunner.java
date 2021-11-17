package com.xworkz.getClass.runner;

import com.xworkz.getClass.enums.SweetColor;
import com.xworkz.getClass.enums.SweetShape;
import com.xworkz.object.methods.getClass.Sweet;

public class SweetRunner {

	public static void main(String[] args) {

		Sweet sweet = new Sweet();
		sweet.setColor(SweetColor.WHITE);
		sweet.setName("Kaju barfi");
		sweet.setPrice(900.00);
		sweet.setShape(SweetShape.SQUARE);
		System.out.println(sweet.toString());
		System.out.println(sweet.hashCode());

		Sweet sweet1 = new Sweet();
		sweet1.setColor(SweetColor.WHITE);
		sweet1.setName("Kaju barfi");
		sweet1.setPrice(800.00);
		sweet1.setShape(SweetShape.SQUARE);

		boolean same = sweet.equals(sweet1);
		System.out.println(same);

		Sweet sweet2 = new Sweet();
		Class cls = sweet2.getClass();

		System.out.println("****************getClass-methods-fields-constructor*****************");
		System.out.println("methods:" + cls.getMethods().length);
		System.out.println("fields:" + cls.getFields().length);
		System.out.println("constructor:" + cls.getConstructors().length);
	}

}
