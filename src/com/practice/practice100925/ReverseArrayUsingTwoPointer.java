package com.practice.practice100925;

import java.util.Arrays;

public class ReverseArrayUsingTwoPointer {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 5, 6, 7, 8 };
		reverseArray(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void reverseArray(int[] arr) {

		int start = 0, end = arr.length - 1;

		while (start < end) {
			SwapValueInArray.swap(arr, start, end);
			start++;
			end--;
		}

	//n	System.out.println(Arrays.toString(arr));
	}
}
