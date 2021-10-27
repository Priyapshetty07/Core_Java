package com.xworkz.computer.operator;

public class MonitorOperator {

	private String[] store = new String[5]; // instance
	 private int count=0;
    
	public MonitorOperator() {
		System.out.println("invoked no argument");
	}

	public void display(String monitorName) {
		System.out.println("invoked display");
		if (monitorName != null && this.count<this.store.length) {
			this.store[count] = monitorName;//5
			count++;
		} else
			System.err.println("Monitor is NOT added to Store or store is full");
	}

	public void addAllElements() {
		System.out.println("invoked add All Elements");
		for (int computer = 0; computer < this.store.length; computer++) {
			String ref = this.store[computer];
			System.out.println(ref);
		}
	}

}
