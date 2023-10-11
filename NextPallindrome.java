package com.edubridge;

import java.util.Scanner;

public class NextPallindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		
		while(true) {
			if(isPallindrome(++n)) {
				System.out.println(n);
				break;
			}
		}
	}
	
	static boolean isPallindrome(int n) {
		int temp = n;
		int rev = 0;
		while(temp>0) {
			int rem = temp % 10;
			rev = rev * 10 + rem;
			temp /= 10;
		}
		
		if(n == rev) {
			return true;
		}
		return false;
	}
}
