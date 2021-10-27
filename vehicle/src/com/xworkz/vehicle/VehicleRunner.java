package com.xworkz.vehicle;

import com.xworkz.vehicle.operator.VehicleOperator;

public class VehicleRunner {

	public static void main(String[] args) {

		VehicleOperator operator = new VehicleOperator();
		
		operator.riding("Royal Enfield");
		
		operator.addAllElements();
		
		operator.riding("KTM");
		operator.riding("Himalayan");
		operator.riding("ThunderBird");
		operator.riding("BMW");
		
		operator.addAllElements();
		

	}

}
