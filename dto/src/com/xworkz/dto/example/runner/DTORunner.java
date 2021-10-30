package com.xworkz.dto.example.runner;

import com.xworkz.dto.example.BluetoothDTO;
import com.xworkz.dto.example.CementDTO;
import com.xworkz.dto.example.ChargerDTO;
import com.xworkz.dto.example.DishDTO;
import com.xworkz.dto.example.SolarDTO;
import com.xworkz.dto.example.StatueDTO;
import com.xworkz.dto.example.VehicleDTO;

public class DTORunner {

	public static void main(String[] args) {
	
		
		BluetoothDTO bluetoothDTO = new BluetoothDTO();

		bluetoothDTO.setBrand("ipod");
		bluetoothDTO.setColor("White");
		bluetoothDTO.sethZ(50);
		bluetoothDTO.setPrice(35000);

        System.out.println("----------Bluetooth----------");
		String name	=bluetoothDTO.getBrand();
		String clr= bluetoothDTO.getColor();
		System.out.println(name.concat(" ").concat(clr).concat(" ").concat(clr).concat(" ").concat(String.valueOf(bluetoothDTO.gethZ())).concat(" ").concat(String.valueOf(bluetoothDTO.getPrice())));

		
        CementDTO cementDTO = new CementDTO();
		
        cementDTO.setBrand("ACC");
        cementDTO.setPrice(400);
        cementDTO.setkG(25);
        cementDTO.setIsiMark(true);
        cementDTO.setGypSum(false);

        System.out.println("----------Cement----------");
		String name1=cementDTO.getBrand();
		System.out.println(name1.concat(" ").concat(String.valueOf(cementDTO.getkG())).concat(" ").concat(String.valueOf(cementDTO.getPrice())).concat(" ").concat(String.valueOf(cementDTO.isIsiMark())).concat(String.valueOf(cementDTO.isGypSum())));
		
		
        ChargerDTO chargerDTO = new ChargerDTO();
		
        chargerDTO.setBrand("vivo");
        chargerDTO.setPrice(950.00);
        chargerDTO.setPort(2);
        chargerDTO.setColor("white");
        
        System.out.println("----------Charger----------");
		 String brand1 = chargerDTO.getBrand();
		 String colors1 =chargerDTO.getColor();
		 
		System.out.println(chargerDTO.getBrand().concat(" ").concat(chargerDTO.getColor()).concat(" ").concat(String.valueOf(chargerDTO.getPrice()).concat(" ")).concat(String.valueOf(chargerDTO.getPort())));
	
        
        SolarDTO solarDTO = new SolarDTO();
		
		solarDTO.setBrand("V-Guard");
		solarDTO.setColor("White");
		solarDTO.setPrice(25000.000);
		solarDTO.setLength(12);
		solarDTO.setCapacity(1500);
		
		 System.out.println("----------Solar----------");
		 String brand = solarDTO.getBrand();
		 String colors = solarDTO.getColor();
		 
		System.out.println(solarDTO.getBrand().concat(" ").concat(solarDTO.getColor()).concat(" ").concat(String.valueOf(solarDTO.getPrice()).concat(" ")).concat(String.valueOf(solarDTO.getLength()).concat(" ")).concat(String.valueOf(solarDTO.getCapacity()).concat(" ")));
	
		
		StatueDTO statueDTO = new StatueDTO();
		statueDTO.setBrand("grace");
		statueDTO.setColor("Black");
		statueDTO.setPrice(2000.5);
		statueDTO.setSize(58);
		
		System.out.println("----------Statue----------");
		System.out.println(statueDTO.getBrand().concat(" ").concat(statueDTO.getColor()).concat(" ").concat(String.valueOf(statueDTO.getPrice()).concat(" ")).concat(String.valueOf(statueDTO.getSize()).concat(" ")));


		DishDTO dishDTO = new DishDTO();
		dishDTO.setBrand("Airtel");
		dishDTO.setColor("black");
		dishDTO.setPrice(7000.99);
		dishDTO.setNoOfChannels(250);
		
		System.out.println("----------Dish----------");
		System.out.println(dishDTO.getBrand().concat(" ").concat(dishDTO.getColor()).concat(" ").concat(String.valueOf(dishDTO.getPrice()).concat(" ")).concat(String.valueOf(dishDTO.getNoOfChannels()).concat(" ")));
	
       VehicleDTO vehicleDTO = new VehicleDTO();
		
        vehicleDTO.setCompany("Honda");
        vehicleDTO.setColor("White");
        vehicleDTO.setNumber("KA26 M 2568");
        vehicleDTO.setType(true);
        vehicleDTO.setPirce(70000);
		
		String cmp=vehicleDTO.getCompany();
		String clr1=vehicleDTO.getColor();
		String set1 = vehicleDTO.getNumber();
		
		System.out.println("----------Vehicle----------");
		System.out.println(cmp.concat(" ").concat(clr1).concat(" ").concat(set1).concat(" ").concat(String.valueOf(vehicleDTO.getPirce())).concat(" ") .concat(String.valueOf(vehicleDTO.isType())));	
	}

}
