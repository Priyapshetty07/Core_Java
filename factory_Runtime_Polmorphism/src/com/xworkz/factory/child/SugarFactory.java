package com.xworkz.factory.child;

import com.xwork.factory.parent.Factory;

public class SugarFactory extends Factory {

	public SugarFactory() {
		System.out.println("invoked no args const SugarFactory");
	}

	public void manufacture() {
		System.out.println("Child class(SugarFactory) is invoked from manufacture method");
	}

	public String toString() {
		System.out.println("Child class(SugarFactory) is invoked from toString method");
		return "Child-toString";

	}

	public int hashCode() {
		System.out.println("Child class(SugarFactory) is invoked from hashCode method" + super.hashCode());
		return 500;

	}

}
