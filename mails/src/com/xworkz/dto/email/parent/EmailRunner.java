package com.xworkz.dto.email.parent;

public class EmailRunner {

	public static void main(String[] args) {

		EmailDTO emailDTO = new EmailDTO();

		emailDTO.setStorageSize(500);
		emailDTO.setFree(true);
		emailDTO.setNoOfEmailPerDay(150);
		emailDTO.setEmailID("priyapshetty007@gmail.com");

		System.out.println("emailDTO1-getStorageSize:" + emailDTO.getStorageSize());
		System.out.println("emailDTO1-isFree:" + emailDTO.isFree());
		System.out.println("emailDTO1-getNoOfEmailPerDay:" + emailDTO.getNoOfEmailPerDay());
		System.out.println("emailDTO1-getEmailID:" + emailDTO.getEmailID());

	}

}
