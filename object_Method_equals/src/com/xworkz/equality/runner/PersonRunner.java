package com.xworkz.equality.runner;

import com.xworkz.objectmethods.equality.Person;

public class PersonRunner {

	public static void main(String[] args) {

		Person person = new Person();
		person.setName("Priya P Shetty");
		person.setEmail("priyapshetty007@gmail.com");
		person.setCity("Shimoga");

//        Person person2 = new Person();
//        person2.setName("Diya P Shetty");
//        person2.setEmail("diyapshetty13@gmail.com");
//        person2.setCity("Udupi");

		Person person2 = new Person();
		person2.setName("Priya P Shetty");
		// person2.setName("Diya P Shetty");
		// person2.setEmail("priyapshetty007@gmail.com");
		person2.setEmail("priyapshetty007@gmail.com");
		person2.setCity("Shimoga");

		if (person == person2) {
			System.out.println("both pointing to same memory");
		}

		// person or object call-->jvm decide which one to call---runtime polymorphism
		boolean same = person.equals(person2);// TRUE
		{
			System.out.println(same);
		}

	}

}
