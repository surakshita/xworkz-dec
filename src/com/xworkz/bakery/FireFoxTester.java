package com.xworkz.bakery;

import com.xworkz.bakery.browser.Browser;
import com.xworkz.bakery.browser.Firefox;

public class FireFoxTester {

	public static void main(String[] args) {

		Object generic = new Firefox();

		Browser browser = new Firefox();

		Firefox fireFox = new Firefox();

		// instanceOf

		generic = new String("test");
		if (generic instanceof Firefox) {
			System.out.println("fire fox");
			Firefox fireFoxCasted = (Firefox) generic;
			System.out.println(fireFox.getName());

		} else {
			System.out.println("not a fire fox");
		}

	}

}
