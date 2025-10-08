package com.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		/*
		 * Selection Sort is a simple sorting algorithm that repeatedly finds the
		 * minimum element from an unsorted portion of the list and swaps it with
		 * the first element of that portion until the entire list is sorted.
		 */
		
		int arr[]= {4,5,7,6,3,1,2};
		int temp,smallest;
		
		for(int i=0;i<arr.length-1;i++)
		{
			smallest=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[smallest]>arr[j])
				{
					smallest=j;
				}
			}
			
			temp=arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
			System.out.println(temp);
			
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
