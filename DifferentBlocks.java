package com.edubridge;

public class DifferentBlocks {
	
	public DifferentBlocks() {
		System.out.println("Constructor");
	}
	
	static {
		System.out.println("Static Block");
	}
	
	//runs before constructor
	{
		System.out.println("Anonomous Block");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Block");
		DifferentBlocks obj = new DifferentBlocks();
	}

}
