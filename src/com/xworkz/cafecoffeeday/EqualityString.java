package com.xworkz.cafecoffeeday;

public class EqualityString {

	public static void main(String[] args) {
		
		String gadget="X-box";
		String gamingSystem="";
		String device="X-box";
		if(gadget==gamingSystem && gadget==device) {
			System.out.println("both ref pointing to same obj");
		} else {
			System.out.println("both ref pointing to different obj");
		}
		
		boolean value=gadget.equals(gamingSystem);
		System.out.println(value);
		
		boolean empty=gadget.isEmpty();
		System.out.println(empty);
		
		System.out.println(device);
		
		String upperDevice=device.toUpperCase();
		System.out.println(upperDevice);
		
		device=device.toLowerCase();
		System.out.println(device);
		
		//concatenation
		String concat=device+"Gaming";
		System.out.println(concat);
		
		String concatUsingMethod=device.concat("Virtual");
		System.out.println(concatUsingMethod);
		System.out.println(device.concat("Super"));
		
		//other 8 methods
		String space=gadget.replace("-", " ");
		System.out.println(space);
		
		int index=device.indexOf("b");
		System.out.println(index);
		
		boolean find=gadget.contains(space);
		System.out.println(find);
		
		boolean ending=device.endsWith(concatUsingMethod);
		System.out.println(ending);
		
		String replace=gadget.replaceAll("box", "workz");
		System.out.println(replace);
		
		String trim=device.trim();
		System.out.println(trim);
		
		int indexCount=concatUsingMethod.codePointCount(3, 7);
		System.out.println(indexCount);
		
		String subString=space.substring(0, 3);
		System.out.println(subString);
	}

}
	


