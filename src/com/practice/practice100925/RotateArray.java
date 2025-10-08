package com.practice.practice100925;

import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
	//	rotateArrayByOne(arr);

		rotateArrayByGivenNo(arr);
	}

	private static void rotateArrayByGivenNo(int[] arr) {

		int k=3;
		
		for(int j=1;j<=k;j++)
		{
			int lastElement = arr[arr.length - 1];
			for (int i = arr.length - 1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}

			arr[0] = lastElement;
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void rotateArrayByOne(int[] arr) {

		int lastElement = arr[arr.length - 1];

		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}

		arr[0] = lastElement;

		System.out.println(Arrays.toString(arr));
	}
}
