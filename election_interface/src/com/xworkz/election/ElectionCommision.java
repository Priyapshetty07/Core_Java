package com.xworkz.election;

import com.xworkz.interfaces.election.ElectionRule;

public class ElectionCommision {

	private ElectionRule electionRule;

	public ElectionCommision(ElectionRule electionRule) {
		this.electionRule = electionRule;
	}

	public void provideVoterID() {
		System.out.println("INVOKED VOTER id provider");
		if (electionRule != null) {
			int age = electionRule.validAge();

			int wardNo = electionRule.wardNo();

			String address = electionRule.address();

			if (age > 18 && wardNo >= 1 && wardNo <= 300 && address.length() >= 10 && address.length() <= 50) {
				System.out.println("voter ID can be provided");
			} else {
				System.out.println("voter ID cannot be provided");
			}
		} else {
			System.out.println("Reference is not poining to any memory location");

		}
	}
}