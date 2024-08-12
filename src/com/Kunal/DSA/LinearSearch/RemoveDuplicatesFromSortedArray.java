package com.Kunal.DSA.LinearSearch;

import java.util.Iterator;

public class RemoveDuplicatesFromSortedArray {

	static int removeDuplicate(int arr[]) {
		
		int rd=0;
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[rd]!=arr[i])
			{
				rd++;
				arr[rd]=arr[i]; 
			}
		}
		System.out.println(rd);
		return rd+1;
	}
	
	
	
	
	public static void main(String[] args) {
	
		int []arr= {0,0,1,1,1,2,3,4,5,5};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		int rd = removeDuplicate(arr);
		System.out.println();
		for (int i = 0; i < rd; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
