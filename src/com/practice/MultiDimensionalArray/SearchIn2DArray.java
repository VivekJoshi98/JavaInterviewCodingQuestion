package com.practice.MultiDimensionalArray;

import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {
		
		int [][] arr= {
				{23,4,1},
				{18,12,3,9},
				{78,99,34,56},
				{18,12}
		};
		int target=56;	
	//	System.out.println(Arrays.toString(search(arr,target)));
		System.out.println("Maximum number is in array : "+maxIn2DArray(arr));
	}

	private static int maxIn2DArray(int[][] arr) {
		
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]>max)
				{
					max=arr[i][j];
				}
			}
		}
		return max;
//		System.out.println("Maximum number is in array : "+max);
		
		
	}

	private static int[] search(int[][] arr, int target) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]==target)
				{
					return new int[]{i,j};
				}
			}
		}
		return new int[] {-1,-1};
	}
}
