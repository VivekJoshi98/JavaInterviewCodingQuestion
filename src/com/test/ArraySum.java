package com.test;

public class ArraySum {
	
	public static void main(String[] args) {
		

		int arr[]= {1,2,35,4,3,6,7};
		
		int sum=0;
		
//		for (int i : arr) {
//			sum+=i;
//		}
//		
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
				
		System.out.println(sum);
	}
	
}
	