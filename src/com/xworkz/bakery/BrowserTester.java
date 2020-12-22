package com.xworkz.bakery;

import com.xworkz.bakery.browser.Browser;

public class BrowserTester {

	public static void main(String[] args) {

		Browser browser = new Browser();
		browser.setName("chrome");
		System.out.println(browser.getName());

		// parent-name ref-var=new constructor;

		Object obj = new Browser();

		Browser chidRef = (Browser) obj;
		chidRef.setName("IE");

		System.out.println(chidRef.getName());

		Object day = new String("Friday");

		// class-cast exception Browser notGoodRef=(Browser)day;

	}

}
