package com.xworkz.getClass.runner;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.xworkz.object.methods.getClass.Camer;

public class CamerRunner {

	public static void main(String[] args) {

		Camer camer = new Camer();
		camer.setBrand("Nikon");
		camer.setModelNo(3500);
		camer.setPrice(45500.0f);
		// camer.setWarranty((byte) 3);
		camer.setWarranty(2);
		System.out.println("toString:" + camer.toString());
		System.out.println("hashCode:" + camer.hashCode());

		Camer camer1 = new Camer();
		camer1.setBrand("Nikon");
		camer1.setModelNo(3500);
		camer1.setPrice(45500.0f);
		// camer1.setWarranty((byte) 3);
		camer1.setWarranty(3);

		boolean same = camer.equals(camer1);
		System.out.println(same);

		// class is Class
		// System.out.println("**************getClass*******************");
		Camer camer2 = new Camer();
		Class class1 = camer2.getClass();
		/*
		 * System.out.println("Package: " + class1.getPackage());
		 * System.out.println("Superclass: " + class1.getSuperclass());
		 * System.out.println("CanonicalName: " + class1.getCanonicalName());
		 * System.out.println("Modifiers: " + class1.getModifiers());
		 * System.out.println("Name: " + class1.getName());
		 * System.out.println("PackageName: " + class1.getPackageName());
		 * System.out.println("SimpleName: " + class1.getSimpleName());
		 * System.out.println("TypeName: " + class1.getTypeName());
		 * System.out.println("AnnotatedInterfaces: " +
		 * class1.getAnnotatedInterfaces()); System.out.println("ClassLoader: " +
		 * class1.getClassLoader());
		 */

		System.out.println("**************getClass Methods-Fields-Constructors*******************");
		System.out.println("Methods: " + class1.getMethods().length);
		System.out.println("Fields: " + class1.getFields().length);
		System.out.println("Constructors: " + class1.getConstructors().length);

		// Camer->Class->Consturctor[]
		/*
		 * System.out.println("**************getClass-Consturctor[]*******************")
		 * ;
		 * 
		 * Constructor[] constructors = class1.getConstructors(); for (int i = 0; i <
		 * constructors.length; i++) { Constructor constructor = constructors[i];
		 * System.out.println("constructor Name: " + constructor.getName());
		 * System.out.println("ParameterCount: " + constructor.getParameterCount());
		 * System.out.println("Modifiers: " + constructor.getModifiers());
		 * 
		 * } System.out.println("**************getClass-method*******************");
		 * Method[] methods = class1.getMethods(); for (int i = 0; i < methods.length;
		 * i++) { Method method = methods[i]; System.out.println("method Name: " +
		 * method.getName()); System.out.println("Modifiers: " + method.getModifiers());
		 * System.out.println("ParameterCount: " + method.getParameterCount());
		 * System.out.println("ReturnType: " + method.getReturnType());
		 * 
		 * }
		 * 
		 * System.out.println("**************getClass-Object*******************");
		 * Object object = new Object(); Class objectClass = object.getClass();
		 * System.out.println("PackageName: " + objectClass.getPackageName());
		 * System.out.println("Name: " + objectClass.getName());
		 * System.out.println("Superclass: " + objectClass.getSuperclass());
		 */

	}

}
