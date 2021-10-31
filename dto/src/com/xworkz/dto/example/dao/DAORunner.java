package com.xworkz.dto.example.dao;

import com.xworkz.dto.example.BluetoothDTO;
import com.xworkz.dto.example.ChargerDTO;
import com.xworkz.dto.example.DishDTO;
import com.xworkz.dto.example.VehicleDTO;

public class DAORunner {

	public static void main(String[] args) {

		System.out.println("----------Bluetooth----------");
		BluetoothDAO dao = new BluetoothDAO();

		BluetoothDTO bluetooth = new BluetoothDTO("OnePlus", "Black", 1800, 60);
		dao.add(bluetooth);

		BluetoothDTO bluetooth1 = new BluetoothDTO("Samsung", "red", 1100, 70);
		dao.add(bluetooth1);

		dao.delete(1);

		System.out.println("----------Charger----------");
		ChargerDAO dao1 = new ChargerDAO();

		ChargerDTO charger = new ChargerDTO("Vivo", "Black", 1985.00, 2);
		dao1.addCharger(charger);

		ChargerDTO charger1 = new ChargerDTO("iphone", "white", 1500.00, 1);
		dao1.addCharger(charger1);

		dao1.deleteCharger(2);

		System.out.println("----------Vehicle----------");
		VehicleDAO dao2 = new VehicleDAO();

		VehicleDTO vehicle = new VehicleDTO("Maruti Suzuki", true, 59000, "KA14 S 5432", "White");
		dao2.addVehicle(vehicle);

		VehicleDTO vehicle1 = new VehicleDTO("Mahindra", false, 60800, "KA14 S 9876", "Black");
		dao2.addVehicle(vehicle1);

		dao2.deleteVehicle(3);

		System.out.println("----------Dish----------");
		DishDAO dao3 = new DishDAO();

		DishDTO dish = new DishDTO("Tata sky", "Black", 500.00, 250);
		dao3.addDish(dish);

		DishDTO dish1 = new DishDTO("Reliance Digital TV", "White", 800.00, 350);
		dao3.addDish(dish1);

		dao3.deleteDish(3);

	}

}
