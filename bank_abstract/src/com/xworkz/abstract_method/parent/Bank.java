package com.xworkz.abstract_method.parent;

public abstract class Bank {

	private String name;
	private String ifscCode;

	public Bank(String name, String ifscCode) {
		this.name = name;
		this.ifscCode = ifscCode;
	}

	public abstract void provideLoan();

	public abstract void openAccount();

	public abstract void closeAccount();

	public String getBankName() {
		return this.name;
	}

	public String getIfscCode() {
		return this.ifscCode;
	}

}
