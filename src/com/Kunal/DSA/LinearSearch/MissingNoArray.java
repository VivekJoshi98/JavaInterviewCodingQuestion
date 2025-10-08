package com.Kunal.DSA.LinearSearch;

public class MissingNoArray {

	public static void main(String[] args) {
		
		int arr[]= {3,0,1,2,5};
		int n = arr.length;
		
		int actualSum=0;
		
		for(int a:arr)
		{
			actualSum=actualSum+a;
		}
		
		int excpectedSum=n*(n+1)/2;
		
		int missingNo=excpectedSum-actualSum;
		
		System.out.println("Missing no : "+missingNo);
	}
}

