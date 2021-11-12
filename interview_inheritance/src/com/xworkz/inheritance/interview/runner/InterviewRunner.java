package com.xworkz.inheritance.interview.runner;

import com.xworkz.inheritance.interview.HrInterview;
import com.xworkz.inheritance.interview.Interview;
import com.xworkz.inheritance.interview.TechInterview;

public class InterviewRunner {

	public static void main(String[] args) throws InterruptedException {

		Interview interview = new Interview(); // no-args----super()
		interview.written();

		// parent ref = new childconst();
		Interview interview2 = new TechInterview();// object or instance
		interview2.written();

		TechInterview techInterview = (TechInterview) interview2; // casting
		// techInterview.written();
		techInterview.onlineTest();

		TechInterview techInterview1 = new TechInterview();
		techInterview1.written(); // public
		techInterview1.onlineTest();
		// techInterview1.teaBreak(); //error bec protected we cant access in difft
		// package

		// object methods 11--------in that 2 protected clone and finalize
		HrInterview hrInterview = new HrInterview();
		// 11 methods ---9methods from object and 1 methods from hrinterview(1) extends
		// interviews(1)
		hrInterview.equals(null);
		hrInterview.getClass();
		hrInterview.hashCode();
		hrInterview.notify();
		hrInterview.notifyAll();
		hrInterview.toString();
		hrInterview.wait(0);
		hrInterview.wait(0);
		hrInterview.wait(0, 0);
		hrInterview.screeing();
		hrInterview.written();

		Interview interview1 = new HrInterview();
		// 10 methods ---9methods from object and 1 methods from interview
		interview1.equals(null);
		interview1.getClass();
		interview1.hashCode();
		interview1.notify();
		interview1.notifyAll();
		interview1.toString();
		interview1.wait();
		interview1.wait(0);
		interview1.wait(0, 0);
		interview1.written();
	}

}
