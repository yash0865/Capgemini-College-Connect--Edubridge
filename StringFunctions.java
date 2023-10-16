package com.edubridge;

import java.util.Arrays;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "   Yash Sutar  ";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		str = str.trim();
		System.out.println(str);
		System.out.println(str.startsWith("Y"));
		System.out.println(str.endsWith("M"));
		System.out.println(str.charAt(5));
		System.out.println(str.length());
		System.out.println(str.replace("Yash", "Raj"));
		System.out.println(Arrays.toString(str.toCharArray()));
		
		//if we create a string using new keyword it create in heap
		// but if we use
	}
	
	

}
