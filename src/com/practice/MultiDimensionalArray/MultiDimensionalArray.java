package com.practice.MultiDimensionalArray;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class MultiDimensionalArray {

	public static void main(String[] args) {
	
	//	TwoDArray();
		twoDArrayDynamically();
		
	}

	private static void twoDArrayDynamically() {
		
		int arr[][]= new int[3][3];
//		System.out.println(arr.length-1);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a input : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
	//Way of iteration of 2d array
		// 1.using for loop
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" arr["+i+"]["+j+"]");
			}
			System.out.println();
		} 
		//2. using Arrays.deepToString() method
		System.out.println(Arrays.deepToString(arr));
		
		//3. using for each loop
		for(int[]a:arr)
		{
			System.out.println(Arrays.toString(a));
		}
		sc.close();
		
	}
//**************************************************************
	private static void TwoDArray() {
		
		int arr[][]= {
				{1,2,3,4},
				{5,6,7},
				{8,9,10}
		};
		
		//int ar[]= {1,23,4,5,5};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println(Arrays.deepToString(arr));
		
	}
	
	
	
}
