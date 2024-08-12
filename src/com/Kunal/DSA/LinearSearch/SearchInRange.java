package com.Kunal.DSA.LinearSearch;

public class SearchInRange {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8};
		int start=2;
		int end=6;
		int target=4;
		searchInRange(arr,start,end,target);
	}

	private static void searchInRange(int[] arr, int start, int end,int target) {
		
		for(int i=start;i<=end;i++)
		{
			if(arr[i]==target)
			{
				System.out.println(arr[i]);
			}
		}
		
	}
}
