package com.practice.practice100925;

public class MaxWealthOfCustomer {

	public static void main(String[] args) {
		int arr[][]= {
				{1,2,4},
				{2,5,3}
		};
		
		System.out.println(findMaxSum(arr));
	}

	private static int findMaxSum(int[][] arr) {
		
		int max=Integer.MIN_VALUE;
		
		
		for (int i = 0; i < arr.length; i++) {
			int sum=0;
			for (int j = 0; j < arr[i].length; j++) {
				sum=sum+arr[i][j];
			}
			if(sum>max)
			{
				max=sum;
			}
		}
		return max;
	}
}
