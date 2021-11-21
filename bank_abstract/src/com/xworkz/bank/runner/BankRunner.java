package com.xworkz.bank.runner;

import com.xworkz.abstarct.method.child.HdfcBank;
import com.xworkz.abstract_method.parent.Bank;
import com.xworkz.abstract_method.parent.IciciBank;

public class BankRunner {

	public static void main(String[] args) {

		IciciBank icici = new IciciBank("ICICI Bank", "icici12347896554");
		icici.openAccount();
		icici.provideLoan();
		icici.closeAccount();

		HdfcBank hdfc = new HdfcBank("HDFC Bank", "hdfc5678788555");
		hdfc.openAccount();
		hdfc.provideLoan();
		hdfc.closeAccount();

		Bank icici1 = new IciciBank("ICICI Bank", "icici78965412");
		icici1.openAccount();
		icici1.provideLoan();
		icici1.closeAccount();

		Bank hdfc1 = new HdfcBank("HDFC Bank", "hdfc987456321");
		hdfc1.openAccount();
		hdfc1.provideLoan();
		hdfc1.closeAccount();

	}

}
