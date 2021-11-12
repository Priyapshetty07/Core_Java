package com.xworkz.email.dao;

import com.xworkz.dto.email.parent.EmailDTO;
import com.xworkz.dto.gmailmail.child.GmailEmailDTO;
import com.xworkz.dto.outlook.child.OutLookEmailDTO;

public class MailDAORunner {

	public static void main(String[] args) {

		EmailDAO emailDAO = new EmailDAO();

		EmailDTO emailDTO = new EmailDTO(500, true, 100, "priya@gmail.com");
		emailDAO.save(emailDTO);

		OutLookEmailDTO outLookEmailDTO = new OutLookEmailDTO(600, true, 600, false, 250, "evva@gmail.com");
		emailDAO.save(outLookEmailDTO);

		GmailEmailDTO gmailEmailDTO = new GmailEmailDTO("white", true, 500, true, 250, "diya@gmail.com");
		emailDAO.save(gmailEmailDTO);

		emailDAO.displayDetailsEmailDTO();

		// emailDAO.displayDetailsOutLookEmailDTO();

		// emailDAO.displayDetailsGmailEmailDTO();

	}

}
