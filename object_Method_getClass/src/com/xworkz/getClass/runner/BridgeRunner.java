package com.xworkz.getClass.runner;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.xworkz.object.methods.getClass.Bridge;

public class BridgeRunner {

	public static void main(String[] args) {

		Bridge bridge = new Bridge();
		bridge.setName("Sharavathi");
		bridge.setLength(2060.0f);
		bridge.setCost(1645900000.00);
		bridge.setOpenYear(1994);
		System.out.println("toString:" + bridge.toString());
		System.out.println("hashCode:" + bridge.hashCode());

		Bridge bridge1 = new Bridge();
		bridge1.setName("Sharavathi");
		bridge1.setLength(2060.0f);
		bridge1.setCost(1645950000.00);
		bridge1.setOpenYear(1994);

		boolean same = bridge.equals(bridge1);
		System.out.println(same);

		// class is Class
		System.out.println("**************getClass*******************");
		Bridge bridge2 = new Bridge();
		Class class1 = bridge2.getClass();

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

		System.out.println("**************getClass-method-fields-constructor*******************");
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
