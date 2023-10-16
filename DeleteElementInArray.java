package com.edubridge;
import java.util.Scanner;

public class DeleteElementInArray {

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
		
		System.out.println("Enter index of item : ");
		int index = sc.nextInt();
		
		if(index < 0 && index >= arr.length) {
			System.out.println("Invalid index");
		} else {
			int[] newArray = new int[arr.length - 1];
 
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (i != (index-1)){
                    newArray[j] = arr[i];
                    j++;
                }
            }
            
            arr = newArray;

            System.out.print("Updated Array: ");
            for (int i : arr) {
                System.out.print(i + " ");
            }
		}

	}

}
