package com.xworkz.dto.email.parent;

public class EmailDTO {

	private double storageSize;
	private boolean free;
	private int noOfEmailPerDay;
	private String emailID;

	public EmailDTO() {
		System.out.println("No arg Constructor with EmailDAO");
	}

	public EmailDTO(double storageSize, boolean free, int noOfEmailPerDay, String emailID) {
		super();
		this.storageSize = storageSize;
		this.free = free;
		this.noOfEmailPerDay = noOfEmailPerDay;
		this.emailID = emailID;
	}

	public double getStorageSize() {
		return storageSize;
	}

	public void setStorageSize(double storageSize) {
		this.storageSize = storageSize;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

	public int getNoOfEmailPerDay() {
		return noOfEmailPerDay;
	}

	public void setNoOfEmailPerDay(int noOfEmailPerDay) {
		this.noOfEmailPerDay = noOfEmailPerDay;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

}