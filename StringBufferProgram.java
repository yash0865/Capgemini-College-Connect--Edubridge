package com.edubridge;

public class StringBufferProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s = new StringBuffer();
		System.out.println(s.capacity());
		StringBuffer str = new StringBuffer("Yash");
		System.out.println(str);

		System.out.println(str.append(" Sutar"));
		System.out.println(str.insert(4, " Balaso"));
		System.out.println(str.reverse());
		System.out.println(str.replace(5, 12, ""));
		System.out.println(str.reverse());
		System.out.println(str.substring(0,5));
		System.out.println(str.capacity());
	}
}
