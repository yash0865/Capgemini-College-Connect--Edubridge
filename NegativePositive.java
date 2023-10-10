package com.edubridge;

import java.util.Scanner;

class CheckNumber{
	int num;
	
	void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		num = sc.nextInt();
	}
	
	void displayResult() {
		if(num > 0){
			System.out.println(num + " is positive number");
		} else if( num == 0 ) {
			System.out.println(num + " is neither positive nor negative");
		}
		else {
			System.out.println(num + " is negative number");
		}
	}
}

public class NegativePositive {
	public static void main(String[] args) {
		CheckNumber num = new CheckNumber();
		num.inputData();
		num.displayResult();
	}
}
