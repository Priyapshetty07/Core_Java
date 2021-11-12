package com.xworkz.dto.outlook.child;

import com.xworkz.dto.email.parent.EmailDTO;

public class OutLookEmailDTO extends EmailDTO {

	private double cloudStorage;
	private boolean backUp;

	public OutLookEmailDTO() {
		System.out.println("No arg Constructor with OutLookEmailDAO");
	}

	public OutLookEmailDTO(double cloudStorage, boolean backUp, double storageSize, boolean free, int noOfEmailPerDay,
			String emailID) {
		super(storageSize, free, noOfEmailPerDay, emailID);
		this.cloudStorage = cloudStorage;
		this.backUp = backUp;
	}

	public double getCloudStorage() {
		return cloudStorage;
	}

	public void setCloudStorage(double cloudStorage) {
		this.cloudStorage = cloudStorage;
	}

	public boolean isBackUp() {
		return backUp;
	}

	public void setBackUp(boolean backUp) {
		this.backUp = backUp;
	}

}
