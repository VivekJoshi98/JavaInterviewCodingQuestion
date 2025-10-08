package com.searching;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 2,12,15,17,27,29,45};
		int li = 0, hi = arr.length - 1;
		int search = 46;
		int mi = (li + hi) / 2;

		while (li <= hi) {
			if (arr[mi] == search) {
				System.out.println("element is at " + mi + " index position");
				break;
			} else if (arr[mi] < search) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
		if (li > hi) {
			System.out.println("Element is not found ");
		}
	}

}
