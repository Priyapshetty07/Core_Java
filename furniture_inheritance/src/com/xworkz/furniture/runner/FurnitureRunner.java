package com.xworkz.furniture.runner;

import com.xworkz.woodshop.design.ComputerTableFurniture;
import com.xworkz.woodshop.design.Furniture;
import com.xworkz.woodshop.sell.DineTableFurniture;

public class FurnitureRunner {

	public static void main(String[] args) {
		
	   ComputerTableFurniture computerTable = new ComputerTableFurniture();
	   System.out.println(computerTable.shape);
	   //System.out.println(computerTable.price);
	   //System.out.println(computerTable.weight);
	  //System.out.println(computerTable.quantity);
	  
	  Furniture furniture = new Furniture("circle",10.55f);	
	  System.out.println(furniture.shape);
	  
	  DineTableFurniture dineTable = new DineTableFurniture();
	  System.out.println(dineTable.shape);
	  
	}

}
