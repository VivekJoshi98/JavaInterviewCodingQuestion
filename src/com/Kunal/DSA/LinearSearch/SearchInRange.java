package com.Kunal.DSA.LinearSearch;

public class SearchInRange {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8};
		int start=2;
		int end=6;
		int target=3;
		System.out.println("Element is present index : "+searchInRange(arr,start,end,target));
	}

	private static int searchInRange(int[] arr, int start, int end,int target) {
		
		if(arr.length==0)
		{
			return -1;
		}
		
		for(int i=start;i<=end;i++)
		{
			if(arr[i]==target)
			{
				return i;
		//		System.out.println(arr[i]);
			}
		}
		return -1;
		
	}
}
