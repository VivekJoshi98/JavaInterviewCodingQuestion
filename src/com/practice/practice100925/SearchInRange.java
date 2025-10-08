package com.practice.practice100925;

public class SearchInRange {

	public static void main(String[] args) {
		
		int arr[]= {1,2,4,5,7,8,10,12};
		int start=2;
		int end=7;
		int target=8;
		System.out.println("Element is present index : "+searchInRange(arr,start,end,target));
		System.out.println("Minumum element in range is : "+findminInRange(arr,start,end));
	}

	private static int findminInRange(int[] arr, int start, int end) {
		
		int min=Integer.MAX_VALUE;
		for(int i=start;i<=end;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
		
	}

	private static int searchInRange(int[] arr, int start, int end, int target) {
		
		for(int i=start;i<=end;i++)
		{
			if(arr[i]==target)
			{
			//	System.out.println(i);
				return i;
			}
		}
		return -1;
	}
}
