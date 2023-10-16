package com.edubridge;

import java.util.Scanner;

public class InsertElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array :");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter "+arr.length+" elements :");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Original Array :");
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int newArr[] = new int[arr.length + 1];

		System.out.println("Enter index of element to be add : ");
		int index = sc.nextInt();
		
		System.out.println("Enter element to add : ");
		int item = sc.nextInt();
		
		for(int i=0; i<newArr.length; i++) {
			if(i < index-1) {
				newArr[i] = arr[i];
			}
			else if( i == index-1) {
				newArr[i] = item;
			}
			else {
				newArr[i] = arr[i-1];
			}
		}
		
		arr = newArr;
		
		System.out.println("Array after inserting element : ");
		for(int i : arr) {
			System.out.print(i+" ");
		}
	
	
	}

}
