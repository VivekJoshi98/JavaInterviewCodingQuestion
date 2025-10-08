package com.Kunal.DSA.LinearSearch;

import java.util.Arrays;

public class MinAndMaxBy2DArray {

	public static void main(String[] args) {
		 int arr[][]= {
				 {1,3,4,6,3},
				 {12,43,55,65,64},
				 {43,54,65,87,64,72,73}
		 };
		 
		 int target=65;
		 
	//	 int [] ans= minAndMax(arr,target);
	//	 System.out.println(Arrays.toString(ans));
		 int minAndMax = minAndMax(arr,target);
	//	 System.out.println(minAndMax);
		 
	}

	private static int minAndMax(int[][] arr, int target) {
		
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[row].length;col++)
			{
//				if(arr[row][col]==target)
//				{   this is for searching 2d array element
//				 return new int[] {row,col};
//				}
				
				if(arr[row][col]<min)
				{
					min=arr[row][col];
				}else if(arr[row][col]>max)
				{
					max=arr[row][col];
				}
			}
		}
		System.out.println("Min : "+ min +" :: "+ " Max : "+max);
		return 0;
//		return new int[] {-1,-1};
		
	}
}
