package com.practice.practice100925;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[]= {2,4,5,6,7,8};
//		List<Integer> ls=Arrays.asList(1,2,3,4,5,6);
//		System.out.println(ls);
		int index=0;
		int revArray[]=new int[arr.length];
		for(int i=arr.length-1;i>=0;i--)
		{
			revArray[index]=arr[i];
			index++;
		}
		System.out.println(Arrays.toString(revArray));
	}
}
