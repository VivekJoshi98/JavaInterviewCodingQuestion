package com.test.LinearSearch;

public class SearchInRange {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,6,7,8,4};
		int target=8;
		int linearSearch = linearSearch(arr,target,1,5);
		System.out.println(linearSearch);
	}

	private static int linearSearch(int[] arr, int target, int start, int end) {
		
		if(arr.length==0)
		{
			return -1;
		}
		for(int i=start;i<=end;i++)
		{
			if(target==arr[i])
			{
				return i;
			}
		}
		return -1;
	}
}
