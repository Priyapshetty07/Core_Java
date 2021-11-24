package com.xworkz.interfaces.internet;

public class AirtelInternet implements Internet {

	public AirtelInternet() {
		System.out.println("invoked Airtel Internet no args const");
	}

	@Override
	public boolean connect() {
		System.out.println("Connect from AirtelInternet");
		return true;
	}

	@Override
	public int speed() {
		System.out.println("Speed from AirtelInternet");
		return 90;
	}

	@Override
	public void disconnect() {
		System.out.println("disconnect from AirtelInternet");

	}

}
