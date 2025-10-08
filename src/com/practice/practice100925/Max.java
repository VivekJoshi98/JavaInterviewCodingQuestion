package com.practice.practice100925;

public class Max {

	public static void main(String[] args) {
		int arr[]= {12,14,2,5,10,8,25};
		System.out.println(max(arr));
		System.out.println(maxRange(arr,2,5));
	}

	private static int max(int[] arr) {
		int max=Integer.MIN_VALUE;;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	
	private static int maxRange(int [] arr,int start,int end) {
		int max=Integer.MIN_VALUE;
		for (int i = start; i <=end; i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
		}
		return max;	
	}
}
