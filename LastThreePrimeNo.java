package com.edubridge;

public class LastThreePrimeNo {
	public static void main(String[] args) {
		int count = 0;
		for(int i=100; i>=1; i--) {
			if(count == 5) {
				break;
			}
			
			if(isPrime(i)) {
				System.out.print(i+" ");
				count++;
			}
		}
	}
	static boolean isPrime(int n) {
		if(n==1) {
			return false;
		}
		for(int i=2; i < (int)n/2; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
