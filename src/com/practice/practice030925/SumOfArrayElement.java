package com.practice.practice030925;

public class SumOfArrayElement {

	//Sum of even number
	
	public static void main(String[] args) {
		int []arr={2,3,4,5,6};
		
		int sum=0;
		
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(i%2==0)
			sum=sum+arr[i];
		}
		
		System.out.println("Sum of array "+sum);
	}
	
}
