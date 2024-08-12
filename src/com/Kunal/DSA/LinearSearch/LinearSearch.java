package com.Kunal.DSA.LinearSearch;

public class LinearSearch {

	public static void main(String[] args) {
		
		int arr[]= {4,8,6,3,10,2,7,5};
		int search=78;
		
		System.out.println(linearSearch(arr,search));
	}

	private static int linearSearch(int[] arr, int search) {
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==search)
				return i;
		}
		return -1;
	}
}
