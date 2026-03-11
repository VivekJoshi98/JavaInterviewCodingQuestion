package com.test;

public class Prime {

	public static void main(String[] args) {

		int num = 5;
		boolean flag = true;
		if (num <= 1) {
			flag = true;	
		}

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {
				flag = false;
				break;
			}
		}

		if (flag) {
			System.out.println("No is prime");
		} else {
			System.out.println("No is not prime");
		}

	}
}
