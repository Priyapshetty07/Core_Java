package com.xworkz.equality.runner;

import com.xworkz.equality.enums.SockMaterial;
import com.xworkz.equality.enums.SockType;
import com.xworkz.objectmethods.equality.Sock;

public class SockRunner {

	public static void main(String[] args) {

		Sock sock = new Sock();

		sock.setMaterial(SockMaterial.COTTON);
		sock.setPrice(250.00);
		sock.setSize('L');
		sock.setType(SockType.MID_CALF);

		Sock sock1 = new Sock();
		sock1.setMaterial(SockMaterial.COTTON);
		sock1.setPrice(300.00);
		sock1.setSize('L');
		sock1.setType(SockType.ANKEL_FIT);

		if (sock == sock1) {
			System.out.println("both pointing to same memory");
		}
		boolean same = sock.equals(sock1);
		System.out.println(same);

	}
}
