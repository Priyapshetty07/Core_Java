package com.xworkz.election.runner;

import com.xworkz.election.ElectionCommision;
import com.xworkz.interfaces.election.ElectionRule;
import com.xworkz.interfaces.election.PriyaElectionRule;

public class ElectionRunner {

	public static void main(String[] args) {

		ElectionRule electionRule = new PriyaElectionRule();

		ElectionCommision electionCommision = new ElectionCommision(electionRule);

		electionCommision.provideVoterID();

	}

}
