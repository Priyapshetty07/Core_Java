package com.xworkz.dto.example.dao;

import com.xworkz.dto.example.DishDTO;

public class DishDAO {
	private DishDTO[] contain = new DishDTO[6];
	int count;

	public DishDAO() {
		System.out.println("No arg Constructor");

	}

	public void addDish(DishDTO dish) { // ref

		if (this.count < this.contain.length && contain != null) {
			this.contain[count] = dish;
			count++;
			System.out.println("Added charger to Container :".concat(String.valueOf(this.count)).concat("Brand:")
					.concat(dish.getBrand()).concat(" ").concat(" Color:").concat(dish.getColor()).concat(" ")
					.concat(" Price:").concat(String.valueOf(dish.getPrice()).concat(" ").concat(" NoOfChannels:")
							.concat(String.valueOf(dish.getNoOfChannels()))));

		} else {
			System.err.println("the dish is full  ");
		}
	}

	public void deleteDish(int index) {
		System.out.println("Invoked Delete with index " + (String.valueOf(index)));

		if (index >= 0 && index < this.contain.length) {
			this.contain[index] = null;
			System.out.println("Delete the dish with index");

		} else {
			System.err.println("Cannot dish, index is not good ");
		}
	}

}
