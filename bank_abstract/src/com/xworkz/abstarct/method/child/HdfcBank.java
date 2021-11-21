package com.xworkz.abstarct.method.child;

import com.xworkz.abstract_method.parent.Bank;

public class HdfcBank extends Bank {

	public HdfcBank(String name, String ifscCode) {
		super(name, ifscCode);
	}

	@Override
	public void provideLoan() {
		System.out.println("Invoked provideLoan from HDFC bank");

	}

	@Override
	public void openAccount() {
		System.out.println("Invoked openAccount from HDFC bank");
		System.out.println("Account opened for " + getBankName() + " and ifsc code " + getIfscCode());
	}

	@Override
	public void closeAccount() {
		System.out.println("Invoked closeAccount from HDFC bank");
		System.out.println();
	}

}
