package com.edubridge;

import java.util.Scanner;

public class StringPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string : ");
		String str = sc.next();
		
		if(isPallindrome(str.toLowerCase())) {
			System.out.println("Pallindrome");
		} else {
			System.out.println("Not pallindrome");
		}
	}
	
	static boolean isPallindrome(String str) {
		String rev = "";
		for(int i=str.length()-1; i>=0; i--) {
			rev += str.charAt(i);
		}
		return str.equals(rev);
	}
}
