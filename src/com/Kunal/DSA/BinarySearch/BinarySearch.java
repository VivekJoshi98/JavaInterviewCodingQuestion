package com.Kunal.DSA.BinarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[]= {2,4,6,7,9,10,13,15,18};
		int search=13;
		int binarySearch = binarySearch(arr,search);
		System.out.println(binarySearch);
	}

	private static int binarySearch(int[] arr, int search) {
		
		int start=0;
		int end=arr.length-1;
		
		while(start<=end)
		{
			int mid=(start+end)/2;
			
			if(search>arr[mid])
			{
				start=mid+1;
			}
			else if(search<arr[mid])
			{
				end=mid-1;
			}
			else
			{
				return mid;
			}
		}
		return -1;
		
	}
}
