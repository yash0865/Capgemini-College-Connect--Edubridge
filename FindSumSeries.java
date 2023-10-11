package com.edubridge;

import java.util.Scanner;

public class FindSumSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		double sum = 0;
		
		for(int i=1; i<=n; i++) {
			double fact = 1;
			for(int j=1; j<=i; j++) {
				fact *= j;
			}
			double ratio = (double)i/fact;
			sum = sum + ratio;
		}
		
		System.out.println("Sum = "+sum);
	}
}
