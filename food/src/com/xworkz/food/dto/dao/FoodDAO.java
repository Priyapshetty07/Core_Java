package com.xworkz.food.dto.dao;

import com.xworkz.food.dto.FoodDTO;
import com.xworkz.food.dto.FoodType;

public class FoodDAO {

	private FoodDTO[] container = new FoodDTO[7];
	private int count;

	public FoodDAO() {
		System.out.println("invoked foodDAO");
	}

	public void save(FoodDTO foodDTO) {

		if (foodDTO != null && this.count < this.container.length) {
			this.container[count] = foodDTO;
			System.out.println("SAVE FoodDTO at index:".concat(String.valueOf(count)).concat(" ")
					.concat(String.valueOf(foodDTO.getId())).concat(" ").concat(foodDTO.getName()).concat(" ")
					.concat(String.valueOf(foodDTO.getType())).concat(" ").concat(String.valueOf(foodDTO.getPrice()))
					.concat(" ").concat(String.valueOf(foodDTO.getQuantity())));
			this.count++;
		} else {
			System.out.println("container is full or passed null ");
		}
	}

	public void updatePriceByName(String name, double price) {
		if (name != null && price > 0) {
			for (int hotel = 0; hotel < this.container.length; hotel++) {
				FoodDTO food = this.container[hotel];
				if (food != null) {
					String foodName = food.getName();
					if (foodName.equals(name)) {
						System.out.println("Name matched ".concat(name).concat(" ").concat("updating price"));
						food.setPrice(price);
						System.out.println("Updated price: ".concat(String.valueOf(food.getPrice())));

					} else {
						System.out.println("Name is not matched");
					}
				}

			}
		} else {
			System.err.println("Name cannot be null and price should be greater than zero");
		}
	}

	public void updateQuantityByName(String name, int quantity) {
		if (name != null && quantity >= 0) {
			for (int hotel = 0; hotel < this.container.length; hotel++) {
				FoodDTO food = this.container[hotel];
				if (food != null) {
					String foodName = food.getName();
					if (foodName.equals(name)) {
						System.out.println("Name matched ".concat(name).concat(" ").concat(",updating quantity"));
						food.setQuantity(quantity);
						System.out.println("Updated Quantity: ".concat(String.valueOf(food.getQuantity())));

					} else {
						System.out.println("Name is not matched");
					}
				}

			}
		} else {
			System.err.println("Name cannot be null and quantity should be greater than or equal to zero");
		}
	}

	public void findByName(String name) {
		if (name != null) {
			for (int hotel = 0; hotel < this.container.length; hotel++) {
				FoodDTO food = container[hotel];
				if (food != null) {
					String matchName = food.getName();
					if (name.equals(matchName)) {
						System.out.println("Name matched at the index :".concat(String.valueOf(hotel))
								.concat(" and the name is ").concat(" ").concat(matchName));
					} else {
						System.out.println("Not matched");
					}
				} else {
					System.err.println("Name cannot be null");
				}
			}
		}
	}

	public void findByNameAndPrice(String name, double price) {
		if (name != null && price > 0) {
			for (int hotel = 0; hotel < this.container.length; hotel++) {
				FoodDTO food = this.container[hotel];
				if (food != null) {
					String matchName = food.getName();
					double matchPrice = food.getPrice();
					if (matchName.equals(name) && price == matchPrice) {
						System.out.println("Name and price are matched, name:  ".concat(name).concat(" ")
								.concat("and price: ").concat(" ").concat(String.valueOf(price)));
					} else {
						System.out.println("Name or Price not matched ");
					}
				}
			}
		} else {
			System.err.println("Food cannot be null and Price should be greater than zero ");
		}
	}

	public void findByNameAndType(String name, FoodType type) {
		if (name != null && type != null) {
			for (int hotel = 0; hotel < this.container.length; hotel++) {
				FoodDTO food = this.container[hotel];
				if (food != null) {
					String matchFood = food.getName();
					FoodType matchType = food.getType();
					if (matchFood.equals(name) && matchType.equals(type)) {
						System.out.println("Name and type are matched, name:  ".concat(name).concat(" ")
								.concat("and type: ").concat(String.valueOf(type)));
					} else {
						System.out.println("Name or type not matched ");
					}
				}
			}
		} else {
			System.err.println("Name and type cannot be null");
		}
	}

	public void displayDetails() {
		for (int hotel = 0; hotel < this.container.length; hotel++) {
			FoodDTO displayDetails = this.container[hotel];
			if (displayDetails != null) {
				int id = displayDetails.getId();
				String name = displayDetails.getName();
				FoodType type = displayDetails.getType();
				double price = displayDetails.getPrice();
				int quantity = displayDetails.getQuantity();

				System.out.println("ID:".concat(" ").concat(String.valueOf(id)));
				System.out.println("NAME:".concat(" ").concat(name));
				System.out.println("TYPE:".concat(" ").concat(String.valueOf(type)));
				System.out.println("PRICE:".concat(" ").concat(String.valueOf(price)));
				System.out.println("QUANTITY:".concat(" ").concat(String.valueOf(quantity)));
			}
		}
	}

	public void totalFoodItems() {
		int total = 0;
		for (int hotel = 0; hotel < this.container.length; hotel++) {
			FoodDTO food = container[hotel];

			if (food != null) {
				total = total + 1;
			}

		}
		System.out.println("total food items: ".concat(" ").concat(String.valueOf(total)));
	}

}
