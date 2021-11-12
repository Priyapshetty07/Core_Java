package com.xworkz.dto.gmailmail.child;

import com.xworkz.dto.email.parent.EmailDTO;

public class GmailEmailDTO extends EmailDTO {

	private String themeColor;
	private boolean subscribed;

	public GmailEmailDTO() {
		System.out.println("No arg Constructor with GmailEmailDTO");
	}

	public GmailEmailDTO(String themeColor, boolean subscribed, double storageSize, boolean free, int noOfEmailPerDay,
			String emailID) {
		super(storageSize, free, noOfEmailPerDay, emailID);
		this.themeColor = themeColor;
		this.subscribed = subscribed;
	}

//	public GmailEmailDTO(double storageSize, boolean free, int noOfEmailPerDay, String emailID) {
//		super();
//	}

	public String getThemeColor() {
		return themeColor;
	}

	public void setThemeColor(String themeColor) {
		this.themeColor = themeColor;
	}

	public boolean isSubscribed() {
		return subscribed;
	}

	public void setSubscribed(boolean subscribed) {
		this.subscribed = subscribed;
	}

}