package com.test;

public class SumOfEvenNo {

	public static void main(String[] args) {
		
		int arr[]= {2,3,4,5,0};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				sum=sum+arr[i];
			}
		}
		
	//	System.out.println(10/0);//Exception / by Zero
		
		System.out.println(sum);
	}
}
