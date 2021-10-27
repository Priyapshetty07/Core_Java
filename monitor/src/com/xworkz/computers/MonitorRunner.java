package com.xworkz.computers;

import com.xworkz.computer.operator.MonitorOperator;

public class MonitorRunner {

	public static void main(String[] args) {

		MonitorOperator operator = new MonitorOperator();
		
		operator.display("Lenovo");

		operator.addAllElements();

		operator.display("LG");
		operator.display("HP");
		operator.display("DELL");
		operator.display("MAC");
		operator.display("Accer");
		
		operator.addAllElements();
     }
}
