package com.edubridge;

import java.util.Scanner;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array :");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		System.out.println("Enter "+arr.length+" elements :");
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		
		int max1,max2;
		
		max1=max2=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>max1) {
				max2=max1;
				max1=a[i];
			}
			else if(a[i]>max2) {
				max2=a[i];
			}
		}
		
		System.out.println("Second Largest element in an array ="+max2);
	}

}
