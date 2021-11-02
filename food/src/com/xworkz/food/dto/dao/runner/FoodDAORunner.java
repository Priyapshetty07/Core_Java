package com.xworkz.food.dto.dao.runner;

import com.xworkz.food.dto.FoodDTO;
import com.xworkz.food.dto.FoodType;
import com.xworkz.food.dto.dao.FoodDAO;

public class FoodDAORunner {

	public static void main(String[] args) {

		FoodDAO foodDAO = new FoodDAO();

		System.out.println("-----------------SAVE--------------------");
		FoodDTO dto = new FoodDTO(1, "Chicken-Biriyani", FoodType.NON_VEG, 550.00, 3);
		FoodDTO dto1 = new FoodDTO(2, "Veg-Biriyani", FoodType.VEG, 150.00, 2);
		FoodDTO dto2 = new FoodDTO(3, "Mutton-Manchow Soup", FoodType.NON_VEG, 250.00, 3);
		FoodDTO dto3 = new FoodDTO(4, "Paneer-Mancgurian", FoodType.VEG, 200.00, 1);
		FoodDTO dto4 = new FoodDTO(5, "Tandoori-Chicken", FoodType.NON_VEG, 250.00, 3);
		FoodDTO dto5 = new FoodDTO(6, "Masala-Papad", FoodType.VEG, 849.00, 5);

		foodDAO.save(dto);
		foodDAO.save(dto1);
		foodDAO.save(dto2);
		foodDAO.save(dto3);
		foodDAO.save(dto4);
		foodDAO.save(dto5);

		System.out.println("-----------------UPDATE price--------------------");
		foodDAO.updatePriceByName("Tandoori-Chicken", 860.00);

		System.out.println("-----------------UPDATE quantity--------------------");
		foodDAO.updateQuantityByName("Masala-Papad", 3);

		System.out.println("-----------------FIND BY NAME--------------------");
		foodDAO.findByName("Paneer-Mancgurian");

		System.out.println("-----------------FIND BY NAME AND PRICE--------------------");
		foodDAO.findByNameAndPrice("Chicken-Biriyani", 550.00);

		System.out.println("-----------------FIND BY NAME AND TYPE--------------------");
		foodDAO.findByNameAndType("Mutton-Manchow Soup", FoodType.NON_VEG);

		System.out.println("-----------------DISPLAY DETAILS--------------------");
		foodDAO.displayDetails();

		System.out.println("-----------------TOTAL FOOD ITEMS--------------------");
		foodDAO.totalFoodItems();

	}

}
