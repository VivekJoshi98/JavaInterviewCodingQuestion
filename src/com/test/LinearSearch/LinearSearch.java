package com.test.LinearSearch;

public class LinearSearch {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,6,7,8,4};
		int target=10;
		int linearSearch = linearSearch(arr,target);
		System.out.println(linearSearch);
	}

	private static int linearSearch(int[] arr, int target) {
		
		if(arr.length==0)
		{
			return -1;
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==target)
			{
				return i;
			}
		}
		return -1;
		
	}
}
