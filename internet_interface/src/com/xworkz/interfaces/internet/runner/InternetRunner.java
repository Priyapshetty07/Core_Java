package com.xworkz.interfaces.internet.runner;

import com.xworkz.interfaces.internet.AirtelInternet;
import com.xworkz.interfaces.internet.Browser;
import com.xworkz.interfaces.internet.Internet;
import com.xworkz.interfaces.internet.TataInternet;

public class InternetRunner {

	public static void main(String[] args) {

		Internet internet = new AirtelInternet();

		Browser browser = new Browser(internet);

		browser.browse();

		Internet internet2 = new TataInternet();

		Browser browser2 = new Browser(internet2);

		browser2.browse();

	}

}
