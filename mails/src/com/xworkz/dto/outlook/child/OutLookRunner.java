package com.xworkz.dto.outlook.child;

public class OutLookRunner {

	public static void main(String[] args) {

		OutLookEmailDTO outLookEmailDTO = new OutLookEmailDTO();

		outLookEmailDTO.setCloudStorage(18.00);
		outLookEmailDTO.setBackUp(false);

		System.out.println("outLookEmailDTO-getCloudStorage:" + outLookEmailDTO.getCloudStorage());
		System.out.println("outLookEmailDTO-isBackUp:" + outLookEmailDTO.isBackUp());

	}
}
