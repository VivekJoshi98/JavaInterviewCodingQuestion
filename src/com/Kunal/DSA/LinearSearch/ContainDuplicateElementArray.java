package com.Kunal.DSA.LinearSearch;

import java.util.HashSet;

public class ContainDuplicateElementArray {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,1,2,2,2};
		
	//	findDuplicate(arr);
		findDuplicateUsingHashMap(arr);
		
	}

	//  find duplicate using simple method
	private static void findDuplicate(int arr[]) {
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate Element : "+arr[i]);
				}
			}
		}	

	}
	
	private static void findDuplicateUsingHashMap(int arr[]) {
		
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int num:arr)
		{
			if(!hs.add(num))
			{
				System.out.println("Duplicate Element : "+num);
			}
			
		}
		System.out.println(hs);
	
	}
}
