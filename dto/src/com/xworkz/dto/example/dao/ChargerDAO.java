package com.xworkz.dto.example.dao;

import com.xworkz.dto.example.ChargerDTO;

public class ChargerDAO {
	private ChargerDTO[] contain = new ChargerDTO[5];
	int count;

	public ChargerDAO() {
		System.out.println("No arg Constructor");

	}

	public void addCharger(ChargerDTO charger) { // ref

		if (this.count < this.contain.length && contain != null) {
			this.contain[count] = charger;
			count++;
			System.out.println("Added charger to Container :".concat(String.valueOf(this.count)).concat(" Brand:")
					.concat(charger.getBrand()).concat(" ").concat(" Color:")
					.concat(String.valueOf(charger.getColor()).concat(" Price:")
							.concat(String.valueOf(charger.getPrice())).concat(" Port:")
							.concat(String.valueOf(charger.getPort()))));

		} else {
			System.err.println("the charger is full  ");
		}
	}

	public void deleteCharger(int index) {
		System.out.println("Invoked Delete with index " + (String.valueOf(index)));

		if (index >= 0 && index < this.contain.length) {
			this.contain[index] = null;
			System.out.println("Delete the charger with index");

		} else {
			System.err.println("Cannot delete, index is not good ");
		}
	}

}
