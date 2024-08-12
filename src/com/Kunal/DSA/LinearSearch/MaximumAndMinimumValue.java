package com.Kunal.DSA.LinearSearch;

public class MaximumAndMinimumValue {

	
	public static void main(String[] args) {
		
		int arr[]= {2,1,4,5,7,8,2,3,4,1};
		findMaxMinValue(arr);
		
		
	}
	
	private static void findMaxMinValue(int arr[]) {
		
		int maxValue=arr[0];
		int minValue=arr[0];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>maxValue)
			{
				maxValue=arr[i];
			}
			else if(arr[i]<minValue)
			{
				minValue=arr[i];
			}
		}

		System.out.println("Maximum ("+maxValue+") and minimum ("+minValue+") value in an array");
	}
}
