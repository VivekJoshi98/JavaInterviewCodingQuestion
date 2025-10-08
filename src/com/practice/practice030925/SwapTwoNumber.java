package com.practice.practice030925;

public class SwapTwoNumber {

	static void swapWithoutUsingThirdVarible() {
		int a = 10, b = 20;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("A : " + a + " " + "B= " + b);
	}
	
	static void swap() {
		int a = 10, b = 20,temp;

		temp=a;
		a=b;
		b=temp;

		System.out.println("A : " + a + " " + "B= " + b);
	}

	public static void main(String[] args) {

		swapWithoutUsingThirdVarible();
		swap();
	}
}
