package com.test.BinarySearch;

public class CeilingOfNumber {

	public static void main(String[] args) {
		
		int arr[]= {2,5,9,45,55,67,88,91};
		int target=56;
		int ceilingOfNumber = ceilingOfNumber(arr,target);
		System.out.println(ceilingOfNumber);
	}

	private static int ceilingOfNumber(int[] arr, int target) {
		
		if(target>arr[arr.length-1])
		{
			return -1;
		}
		
		int start=0;
		int end=arr.length-1;
		
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			
			if(target>arr[mid])
			{
				start=mid+1;
			}
			else if(target<arr[mid])
			{
				end=mid-1;
			}
			else
				return mid;
		}
		
		return start;
	}
}
