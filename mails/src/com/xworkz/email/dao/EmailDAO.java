package com.xworkz.email.dao;

import com.xworkz.dto.email.parent.EmailDTO;
import com.xworkz.dto.gmailmail.child.GmailEmailDTO;
import com.xworkz.dto.outlook.child.OutLookEmailDTO;

public class EmailDAO {

	EmailDTO[] mails = new EmailDTO[6];
	private int count;

	public EmailDAO() {
		System.out.println("invoked non-args const with EmailDTO");
	}

	public void save(EmailDTO emailDTO) {
		if (emailDTO != null && this.count < this.mails.length) {
			this.mails[count] = emailDTO;
			System.out.println("Email DTO is saved");
			this.count++;
		} else {
			System.out.println("Email is Full");

		}
	}

//	public void save(GmailEmailDTO gmailEmailDTO) {
//		if (gmailEmailDTO != null && this.count < this.mails.length) {
//			this.mails[count] = gmailEmailDTO;
//			System.out.println("GmailEmail DTO is saved");
//			this.count++;
//		} else {
//			System.err.println("GmailEmail  is full");
//		}
//	}
//
//	public void save(OutLookEmailDTO outLookEmailDTO) {
//		if (outLookEmailDTO != null && this.count < this.mails.length) {
//			this.mails[count] = outLookEmailDTO;
//			System.out.println("Outlookemail DTO is saved");
//			this.count++;
//		} else {
//			System.err.println("OutLookEmail  is full");
//		}
//	}

	public void displayDetailsEmailDTO() {

		for (int display = 0; display < this.mails.length; display++) {
			EmailDTO test = this.mails[display];
			if (test != null) {

				System.out.println(String.valueOf(test.getStorageSize()).concat(" ")
						.concat(String.valueOf(test.isFree())).concat(" ")
						.concat(String.valueOf(test.getNoOfEmailPerDay())).concat(" ").concat(test.getEmailID()));
			}

		}
	}

}
