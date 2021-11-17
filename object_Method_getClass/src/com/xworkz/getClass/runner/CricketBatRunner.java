package com.xworkz.getClass.runner;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.xworkz.getClass.enums.CricketBatType;
import com.xworkz.object.methods.getClass.CricketBat;

public class CricketBatRunner {

	public static void main(String[] args) {

		CricketBat cricketBat = new CricketBat();
		cricketBat.setCompanyName("Gray-Nicolls");
		cricketBat.setType(CricketBatType.ENGLISH_WILLOW);
		cricketBat.setPrice(1865.00);
		cricketBat.setWood("Cedrius");
		System.out.println(cricketBat.toString());
		System.out.println(cricketBat.hashCode());

		CricketBat cricketBat1 = new CricketBat();
		cricketBat1.setCompanyName("Gray-Nicolls");
		cricketBat1.setType(CricketBatType.ENGLISH_WILLOW);
		cricketBat1.setPrice(1865.00);
		cricketBat1.setWood("Morus");

		boolean same = cricketBat.equals(cricketBat1);
		System.out.println(same);

		// class is Class
		System.out.println("**************getClass*******************");
		CricketBat cricketBat2 = new CricketBat();
		Class class1 = cricketBat2.getClass();

		System.out.println("Package: " + class1.getPackage());
		System.out.println("Superclass: " + class1.getSuperclass());
		System.out.println("CanonicalName: " + class1.getCanonicalName());
		System.out.println("Modifiers: " + class1.getModifiers());
		System.out.println("Name: " + class1.getName());
		System.out.println("PackageName: " + class1.getPackageName());
		System.out.println("SimpleName: " + class1.getSimpleName());
		System.out.println("TypeName: " + class1.getTypeName());
		System.out.println("AnnotatedInterfaces: " + class1.getAnnotatedInterfaces());
		System.out.println("ClassLoader: " + class1.getClassLoader());

		System.out.println("*************Methods-Fields-Constructors********************");
		System.out.println("Methods: " + class1.getMethods().length);
		System.out.println("Fields: " + class1.getFields().length);
		System.out.println("Constructors: " + class1.getConstructors().length);

		// Bridge->Class->Consturctor[]
		System.out.println("**************getClass-Consturctor[]*******************");

		Constructor[] constructors = class1.getConstructors();
		for (int i = 0; i < constructors.length; i++) {
			Constructor constructor = constructors[i];
			System.out.println("constructor Name: " + constructor.getName());
			System.out.println("ParameterCount: " + constructor.getParameterCount());
			System.out.println("Modifiers: " + constructor.getModifiers());

		}
		System.out.println("**************getClass-method*******************");
		Method[] methods = class1.getMethods();
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			System.out.println("method Name: " + method.getName());
			System.out.println("Modifiers: " + method.getModifiers());
			System.out.println("ParameterCount: " + method.getParameterCount());
			System.out.println("ReturnType: " + method.getReturnType());

		}
	}

}
