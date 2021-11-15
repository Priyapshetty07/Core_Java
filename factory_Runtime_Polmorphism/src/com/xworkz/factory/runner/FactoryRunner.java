package com.xworkz.factory.runner;

import com.xwork.factory.parent.Factory;
import com.xworkz.factory.child.SugarFactory;
import com.xworkz.factory.child1.CarFactory;

public class FactoryRunner {

	public static void main(String[] args) {

		Factory factory = new Factory();
		factory.manufacture();
		factory.open();
		factory.shutDown();
//	factory.toString();
//	factory.hashCode();
		System.out.println(factory.toString());
		System.out.println(factory.hashCode());
		System.out.println("***********************************************");

		Factory carFactory = new CarFactory();
		carFactory.manufacture();
		carFactory.open();
		carFactory.shutDown();
//    carFactory.toString();
//    carFactory.hashCode();
		System.out.println(carFactory.toString());
		System.out.println(carFactory.hashCode());
		System.out.println("***********************************************");

		Factory sugarFactory = new SugarFactory();
		sugarFactory.manufacture();
		sugarFactory.open();
		sugarFactory.shutDown();
		// sugarFactory.toString();
		System.out.println(sugarFactory.toString());
		// sugarFactory.hashCode();
		System.out.println(sugarFactory.hashCode());
		System.out.println("***********************************************");

		SugarFactory sugarFactory2 = new SugarFactory();
		sugarFactory2.manufacture();
		sugarFactory2.open();
		sugarFactory2.shutDown();
		System.out.println(sugarFactory2.toString());
		sugarFactory2.toString();
		System.out.println(sugarFactory2.hashCode());
		sugarFactory2.hashCode();

	}

}
