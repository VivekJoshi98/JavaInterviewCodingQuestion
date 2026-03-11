package com.test;

public class SwapTwoNumber {

	public static void main(String[] args) {
		
		int a=5,b=10;
//		swapUsingThirdVariable(a,b);
		swapWithoutUsingThirdVariable(a,b);
		
	}

	private static void swapWithoutUsingThirdVariable(int a, int b) {
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a+" "+b);
		
	}

	private static void swapUsingThirdVariable(int a, int b) {
		int temp=a; 
		a=b;
		b=temp;
		
		System.out.println(a+" "+b);
	}
}
