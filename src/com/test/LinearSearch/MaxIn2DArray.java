package com.test.LinearSearch;

import java.util.Arrays;

public class MaxIn2DArray {

public static void main(String[] args) {
		
		int [][]arr= {
				{23,4,1},
				{18,12,5,9},
				{18,99}
		};
		
		System.out.println((max(arr)));
	}

	private static int max(int[][] arr) {
		
		int max=arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				if(arr[i][j]>max)
				{
					max=arr[i][j];
				} 
			}       
		}
		return max;
		
	}
}










