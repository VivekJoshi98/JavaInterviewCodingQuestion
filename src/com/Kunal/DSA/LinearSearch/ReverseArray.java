package com.Kunal.DSA.LinearSearch;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8};
		
	//	reverseArray(arr);
		reverseArrayByswapping(arr);
	}

	private static void reverseArray(int[] arr) {//reverseArray by element add in new array
		
		int tempArray[]=new int[arr.length];
		
		int index=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			tempArray[index]=arr[i];
			index++;
		}
		
		System.out.println(Arrays.toString(tempArray));
	}

	private static void reverseArrayByswapping(int[] arr) {
		
		int start=0;
		int end=arr.length-1;
		
		while(start<end)
		{
			swap(arr, start, end);
			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr));

	}

	private static void swap(int[] arr, int i, int j) {
		
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
}
}
