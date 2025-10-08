package com.practice.practice100925;

public class ArraySum {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };
		sumOfArray(arr);
	}

	private static void sumOfArray(int[] arr) {

		int sum = 0;

		for (int i = 0; i <= arr.length - 1; i++) {
			sum = sum + arr[i];
		}
		
		System.out.println("Array Sum :: " + sum);
	}

}
