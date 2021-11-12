package com.xworkz.dto.gmailmail.child;

public class GmailEmailRunner {

	public static void main(String[] args) {

		GmailEmailDTO gmailEmailDTO = new GmailEmailDTO();

		gmailEmailDTO.setThemeColor("White");
		gmailEmailDTO.setSubscribed(true);

		System.out.println("GmailEmailID-getThemeColor:" + gmailEmailDTO.getThemeColor());
		System.out.println("GmailEmailID-isSubscribed:" + gmailEmailDTO.isSubscribed());

	}

}
