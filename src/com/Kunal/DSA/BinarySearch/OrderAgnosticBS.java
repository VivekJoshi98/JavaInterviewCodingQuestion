package com.Kunal.DSA.BinarySearch;

public class OrderAgnosticBS {

	public static void main(String[] args) {
		
		int arr[]= {1,3,4,5,6,7,8,9};
		int arr2[]= {9,8,7,6,4,3,2,1};
		orderAgnosticBS(arr,arr2);
		
	}

	private static void orderAgnosticBS(int[] arr,int[] arr2) {
		
		int start=0;
		boolean isAsc;
		int end=arr.length-1;
		
		if(arr2[start]<arr2[end])               
		{
			isAsc=true;
		}
		else
		{
			isAsc=false;
		}
		
		System.out.println(isAsc);
		
	}
}
