package com.xworkz.vehicle.operator;

public class VehicleOperator {
	
	private String[] types = new String[5];
	private int count=0;
	
	
	public VehicleOperator() {
		System.out.println("No args");
	}
	
	public void riding(String VehicleName)
	{
		if(VehicleName!=null)
		this.types[count]=VehicleName;
		count++;
		System.out.println("Brand of Vehicle:"+VehicleName);
	}
	
	public void addAllElements() {
		System.out.println("invoked add All Elements");
		for (int computer = 0; computer < this.types.length; computer++) {
			String ref = this.types[computer];
			System.out.println(ref);
		}
	}

}