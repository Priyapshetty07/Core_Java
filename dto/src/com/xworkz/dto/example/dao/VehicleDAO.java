package com.xworkz.dto.example.dao;

import com.xworkz.dto.example.VehicleDTO;

public class VehicleDAO {
	private VehicleDTO[] contain = new VehicleDTO[6];
	int count;

	public VehicleDAO() {
		System.out.println("No arg Constructor");

	}

	public void addVehicle(VehicleDTO vehicle) { // ref

		if (this.count < this.contain.length && contain != null) {
			this.contain[count] = vehicle;
			count++;
			System.out.println("Added charger to Container :".concat(String.valueOf(this.count)).concat(" Company:")
					.concat(vehicle.getCompany()).concat(" ").concat(" Color:")
					.concat(String.valueOf(vehicle.getColor()).concat(" ")
							.concat(" Number:").concat(String.valueOf(vehicle.getNumber())).concat(" ").concat(" Type:")
							.concat(String.valueOf(vehicle.isType())).concat(" ").concat(" Pirce:")
							.concat(String.valueOf(vehicle.getPirce()))));

		} else {
			System.err.println("the vehicle is full  ");
		}
	}

	public void deleteVehicle(int index) {
		System.out.println("Invoked Delete with index " + (String.valueOf(index)));

		if (index >= 0 && index < this.contain.length) {
			this.contain[index] = null;
			System.out.println("Delete the vehicle with index");

		} else {
			System.err.println("Cannot vehicle, index is not good ");
		}
	}

}
