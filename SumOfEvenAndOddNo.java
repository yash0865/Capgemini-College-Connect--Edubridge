package com.edubridge;

public class SumOfEvenAndOddNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int evenSum = 0;
		int oddSum = 0;
		
//		for(int i=1; i<=100; i++) {
//			if(i % 2 == 0) {
//				evenSum += i;
//			}
//			else {
//				oddSum += i;
//			}
//		}
		
		int i=1;
		while(i <= 100) {
			if(i%2 == 0) {
				evenSum += i;
			}
			else {
				oddSum += i;
			}
			i++;
		}
		
		
		System.out.println("Sum of even numbers 1 to 100 : "+evenSum);
		System.out.println("Sum of odd numbers 1 to 100 : "+oddSum);

	}

}
