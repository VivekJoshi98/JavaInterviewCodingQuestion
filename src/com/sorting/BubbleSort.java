package com.sorting;

import java.util.Arrays;

public class BubbleSort {
	
	/*
	 * Bubble sort :- is a sorting algorithm that starts from the first element of an array
	 * and compares it with the second element. If the first element is greater than the 
	 * second, we swap them.It continues this process until the end of the array, with 
	 * the largest elements “bubbling” to the top.
	 */

	public static void main(String[] args) {
		
	int arr[]= {4,5,7,6,3,1,2};
	int temp;
	
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=0;j<arr.length-i-1;j++)
		{
		//	System.out.println(Arrays.toString(arr));
			if(arr[j]>arr[j+1])  
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		//	System.out.println(Arrays.toString(arr));
		}
	}
	System.out.println(Arrays.toString(arr));
	
	}
}
