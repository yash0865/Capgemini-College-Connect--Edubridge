package com.edubridge;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[],n , sum=0;
		float avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array :");
		n = sc.nextInt();
		arr = new int[n];
		
		System.out.println("Enter "+arr.length+" elements :");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		avg =(float) sum / n;
		
		System.out.println("Sum = "+ sum);
		System.out.println("Average = "+avg);
	}

}
