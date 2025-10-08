package com.practice.practice100925;

public class SecondLargestElement {
	
	public static void main(String[] args) {
		
		int arr[] = {1,5,9,34,98,23,20,81};

		secondLargestElement(arr);
	}

	private static void secondLargestElement(int[] arr) {
		
		int highest=Integer.MIN_VALUE;
		int secondHighest=Integer.MIN_VALUE;
		int thirdHighest=Integer.MIN_VALUE;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>highest)
			{
				thirdHighest = secondHighest;
				secondHighest = highest;
				highest=arr[i];
			}
			else if(arr[i]<highest && arr[i]>secondHighest)
			{
				thirdHighest = secondHighest;
				secondHighest=arr[i];
			}
			else if(arr[i]<secondHighest && arr[i]>thirdHighest)
			{
				thirdHighest=arr[i];
			}
			
			
			
		}
		System.out.println(highest);
		System.out.println(secondHighest);
		System.out.println(thirdHighest);
		
		
	}

}
