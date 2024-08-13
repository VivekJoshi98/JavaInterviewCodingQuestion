package com.Kunal.DSA.BinarySearch;

public class FloorOfNumber {

	public static void main(String[] args) {
		
		int arr[]= {2,4,6,7,9,10,13,15,18};
		int target=1;
		int binarySearch = floor(arr,target);
		System.out.println(binarySearch);
	}

	//	return the index : greatest number <= targett
	private static int floor(int[] arr, int target) {
		
		int start=0;
		int end=arr.length-1;
		
		while(start<=end)
		{
			int mid=(start+end)/2;
			
			if(target>arr[mid])
			{
				start=mid+1;
			}
			else if(target<arr[mid])
			{
				end=mid-1;
			}
			else
			{
				return mid;
			}
		}
		return end;
		
	}
}
