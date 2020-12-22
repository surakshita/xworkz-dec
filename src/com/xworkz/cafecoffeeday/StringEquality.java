package com.xworkz.cafecoffeeday;

public class StringEquality {

	public static void main(String[] args) {

		String gadget = "PS5 ";
		String gamingSysytem = "";
		String device = "PS5";

		if (gadget == gamingSysytem && gadget == device) {
			System.out.println("both refer to same object");

		} else {
			System.out.println("both are refering to different object");
		}

		boolean value = gadget.isEmpty();
		System.out.println(value);
		System.out.println(device);

		// converting to upper cases
		String deviceUpper = device.toUpperCase();
		System.out.println(deviceUpper);

		// converting to lower case
		device = device.toLowerCase();
		System.out.println(device);

		// concatenation
		String concat = gadget + " playstation";
		System.out.println(concat);

		String contactUsingMethod = device.concat(" populaor game");
		System.out.println(contactUsingMethod);

		// can be used directly without ref var
		System.out.println(gamingSysytem.concat("new game x-box"));

		String space = gadget.replace("5", "");
		System.out.println(space);

		int index = gadget.indexOf("S");
		System.out.println(index);

		boolean find = gadget.contains("P");
		System.out.println(find);

		boolean ending = device.endsWith(contactUsingMethod);
		System.out.println(ending);

		String replace = gadget.replaceAll("5", "2");
		System.out.println(replace);

		String trim = gadget.trim();
		System.out.println(trim);

		int indexCount = contactUsingMethod.codePointCount(0, 3);
		System.out.println(indexCount);

		String subString = space.substring(0, 1);
		System.out.println(subString);
	}

}
