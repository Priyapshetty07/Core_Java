package com.xworkz.abstract_method.parent;

public class IciciBank extends Bank {

	public IciciBank(String name, String ifscCode) {
		super(name, ifscCode);
	}

	@Override
	public void provideLoan() {
		System.out.println("Invoked provideLoan from ICICI bank");
	}

	@Override
	public void openAccount() {
		System.out.println("Invoked openAccount from ICICI bank");
		System.out.println("Account opened for " + getBankName() + " and ifsc code " + getIfscCode());
	}

	@Override
	public void closeAccount() {
		System.out.println("Invoked closeAccount from ICICI bank");
		System.out.println();
	}

}
