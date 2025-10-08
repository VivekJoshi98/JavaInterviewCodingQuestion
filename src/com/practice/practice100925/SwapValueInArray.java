package com.practice.practice100925;

import java.util.Arrays;

public class SwapValueInArray {

	public static void main(String[] args) {
		int arr[]= {12,23,34,56,66,78};
		swap(arr,0,1);
		System.out.println(Arrays.toString(arr));
	}

	 static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
	//	System.out.println(Arrays.toString(arr));
	}
}
