package com.test.LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {
		
		int [][]arr= {
				{23,4,1},
				{18,12,5,9},
				{18,12}
		};
		int target=9;
		
		System.out.println(Arrays.toString(search(arr, target)));
	}

	private static int[] search(int[][] arr, int target) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				if(arr[i][j]==target)
				{
					return new int[] {i,j};
				}
			}
		}
		return new int[] {-1,-1};
		
	}
}












