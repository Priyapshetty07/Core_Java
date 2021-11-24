package com.xworkz.interfaces.internet;

public class TataInternet implements Internet {

	public TataInternet() {
		System.out.println("invoked Tata Internet no args const");
	}

	@Override
	public boolean connect() {
		System.out.println("Connect from Tata Internet");
		return false;
	}

	@Override
	public int speed() {
		System.out.println("Speed from Tata Internet");
		return 80;
	}

	@Override
	public void disconnect() {
		System.out.println("disconnect from Tata Internet");

	}

}
