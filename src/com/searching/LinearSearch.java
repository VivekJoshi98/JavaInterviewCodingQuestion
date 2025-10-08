package com.searching;

public class LinearSearch {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 365, 3, 7, 34, 87, 32 };
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 365) {
				System.out.println("item is present at " + i + " index position");
				temp += 1;
			}

		}
		if (temp == 0) {
			System.out.println("item not found in the list");
		}
	}

}
