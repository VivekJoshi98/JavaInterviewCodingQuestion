package com.practice.practice100925;

public class MinMaxArray {

	public static void main(String[] args) {
		
		int arr[]= {12,14,2,5,10,8,25};
		minMax(arr);
	}

	private static void minMax(int[] arr) {
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
//		System.out.println(min);
//		System.out.println(max);
		
		for(int i=1;i<=arr.length-1;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		
		System.out.println("Minimum : "+min);
		System.out.println("Maximum : "+max);
	}
}
