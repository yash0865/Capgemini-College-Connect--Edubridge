package com.edubridge;

public class Patterns {
	public static void main(String[] args) {
		pattern3(5);
	}
	
	static void  pattern1(int n) {
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	static void pattern2(int n) {
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	static void pattern3(int n) {
		for(int i=n; i>=1; i--) {
			for(int j=1; j<= n-i; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(" "+i+" ");
			}
			System.out.println();
		}
	}
}
