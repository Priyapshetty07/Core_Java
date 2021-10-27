package com.xworkz.helmet;

import com.xworkz.helmet.operator.HelmetOperator;

public class HelmetRunner {

	public static void main(String[] args) {

		HelmetOperator operator = new HelmetOperator();
		operator.bike("Vega");

		operator.addAllElements();
		operator.bike("SteelBird");
		operator.bike("Studs");
		operator.bike("MT Hummer");
		operator.bike("AxorApex");
		operator.bike("yamaha");

		operator.addAllElements();
	}

}
