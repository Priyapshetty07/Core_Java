package com.xworkz.objectmethods.equality;

public class Person {

	private String name;
	private String email;
	private String city;

	public Person() {
		System.out.println("invoked no args const in Person");
	}

	@Override // ref-person-check the email-true
	public boolean equals(Object obj) {
		System.out.println("invoked equals from person");

		if (obj != null) {
			System.out.println("ref is not null");
			if (obj instanceof Person)

			{
				System.out.println("ref is person");
				Person casted = (Person) obj;
				String castedPersonEmail = casted.getEmail();
				String castedName = casted.getName();
				if (this.email.equals(castedPersonEmail) && this.name.equals(castedName)) {
					System.out.println("Emails and Name is matching");
					return true;
				} else {
					System.err.println("Email or Name is not matching");
				}

			} else {
				System.err.println("cannot compare, ref is not a Person");
			}
		} else {
			System.err.println("ref is null pass proper ref");
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
