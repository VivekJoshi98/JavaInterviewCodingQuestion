package com.practice.practice100925;

public class MaxSubArraySum {

	public static void main(String[] args) {
		
//		int[] arr= {5,4,-1,7,8};
		int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
		maxSubarraySum(arr);
	}

	private static void maxSubarraySum(int[] arr) {
		
		int maxSubArray=Integer.MIN_VALUE;
		int sum=0;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			sum+=arr[i];
			if(sum>maxSubArray)
			{
				maxSubArray=sum;
			}
			if(sum<0)
			{
				sum=0;
			}
		
		}
		System.out.println("Maximum Subarray :: "+maxSubArray);
	}
}
