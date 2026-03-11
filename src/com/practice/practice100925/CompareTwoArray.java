package com.practice.practice100925;

import java.util.Arrays;

public class CompareTwoArray {

	public static void main(String[] args) {
		int [] arr1= {2,9,8,6};
		int [] arr2= {2,8,9,5};
	
		boolean flag = compareTwoArray(arr1,arr2);
		
		if(flag)
		{
			System.out.println("Array1 and Array2 are equal");
		}
		else
		{
			System.out.println("Array1 and Array2 are not equal");
		}
		
	}

	private static boolean compareTwoArray(int[] arr1, int[] arr2) {
		
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
			
		boolean flag=false;
		
		if(arr1.length==arr2.length)
		{
			for(int i=0;i<=arr1.length-1;i++)
			{
				if(arr1[i]!=arr2[i])
				{
					flag=false;
					break;
				}
				else
				{
					flag=true;
				}
			}
		}
		return flag;
		
		
	}
}
