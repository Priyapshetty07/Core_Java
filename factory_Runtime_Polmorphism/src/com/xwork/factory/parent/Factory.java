package com.xwork.factory.parent;

public class Factory {

	public Factory() {
		System.out.println("invoked no args const Factory");
	}

	public void manufacture() {
		System.out.println("Parent class is invoked from manufacture method");
	}

	public void open() {
		System.out.println("Parent class is invoked from open method");
	}

	public void shutDown() {
		System.out.println("Parent class is invoked from shutDown method");
	}

	public String toString() {
		System.out.println("Parent class is invoked from toString method");
		return "Parent-toString";

	}

	public int hashCode() {
		System.out.println("Parent class is invoked from hashCode method");
		return 1000;

	}

}
