package com.xworkz.dto.example.dao;

import com.xworkz.dto.example.BluetoothDTO;

public class BluetoothDAO {
	
	private BluetoothDTO[] contain = new BluetoothDTO[5];
	int count;
	
	public BluetoothDAO() {
		System.out.println("No arg Constructor");
	
	}
	
	public void add (BluetoothDTO bluetooth) {     // ref 
		
		if(this.count<this.contain.length && contain!=null ) {
			this.contain[count]=bluetooth;
			count++;
			System.out.println("Added BLuetooth to Container :".concat(String.valueOf(this.count)).concat(" brand:").concat(bluetooth.getBrand()).concat(" ").concat(" Color:").concat(String.valueOf(bluetooth.getColor())));
		}
		else {
			System.err.println("the Blutooth is full  ");
		}
	}
	
	
	public void delete(int index) {
	System.out.println("Invoked Delete with index "+(String.valueOf(index)));
	
	if (index>=0 && index<this.contain.length) {
		this.contain[index]=null;
		System.out.println("Delete the Bluetooth with index");
		
	}
	else {
		System.err.println("Cannot delete, index is not good ");
	}
	}

}
