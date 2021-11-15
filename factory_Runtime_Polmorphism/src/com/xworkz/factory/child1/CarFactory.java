package com.xworkz.factory.child1;

import com.xwork.factory.parent.Factory;

public class CarFactory extends Factory {

	public CarFactory() {
		System.out.println("invoked no args const CarFactory");
	}

	public void manufacture() {
		System.out.println("Child1 class(CarFactory) is invoked from manufacture method");
	}

	public void shutDown() {
		System.out.println("Child1 class(CarFactory) is invoked from shutDown method");
	}

	public String toString() {
		System.out.println("Child1 class(CarFactory) is invoked from toString method");
		return "CarFactory-toString";

	}

	public int hashCode() {
		System.out.println("Child1 class(CarFactory) is invoked from hashCode method");
		return 100;

	}

}
