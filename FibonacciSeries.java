package com.edubridge;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		
		for(int i=1 ; i<=n; i++) {
			System.out.println(a);
			int c = a+b;
			a = b;
			b = c;
		}
		
	}

}
