package com.practice.practice100925;

import java.util.HashSet;

public class CommonElementBetweenTwoArray {

	public static void main(String[] args) {
		
		int arr1[]= {1,2,4,6,8,4,56,89,5,67};
		int arr2[]= {1,2,3,5,7,9,67};
		commonElementBetweenTwoArray(arr1,arr2);
	}

	private static void commonElementBetweenTwoArray(int[] arr1, int[] arr2) {
		
		HashSet<Integer> set=new HashSet<>();
		
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr2.length-1;j++)
			{
				if(arr1[i]==arr2[j])
				{
					set.add(arr1[i]);
					break;
				}
			}
		}
		
		for(int s:set)
		{
			System.out.println(s);
		}
		System.out.println(set);
	}
}
