package com.edubridge;

import java.util.Scanner;

public class SubstractionOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        double sum = 0.0;

        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                // If i is even, add 1/i to the sum
                sum += 1.0 / i;
            } else {
                // If i is odd, subtract 1/i from the sum
                sum -= 1.0 / i;
            }
        }

        System.out.println("The sum of the series is: " + sum);
	}

}
