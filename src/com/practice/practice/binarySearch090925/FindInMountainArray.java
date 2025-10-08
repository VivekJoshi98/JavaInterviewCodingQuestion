package com.practice.practice.binarySearch090925;

public class FindInMountainArray {

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 5, 7, 6, 3, 2 };
		int target=10;
		int search = search(arr, target);	
		System.out.println(search);
	}
	
	public static int search(int[] arr, int target) {
		
		int start = 0;
		int end = arr.length - 1;
		int peakIndex = peakIndex(arr, start, end);
//		System.out.println(peakIndex);
		
		int firstTry = orderAgnosticBS(arr,target, start, peakIndex);
		
		if(firstTry!=-1)
		{
			return firstTry;
		}	
		return orderAgnosticBS(arr, target, peakIndex+1, end);
	}

	private static int peakIndex(int[] arr, int start, int end) {

		while (start < end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] > arr[mid + 1]) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return end;

	}

	  static int orderAgnosticBS(int[] arr, int target, int start, int end) {
	        // find whether the array is sorted in ascending or descending
	        boolean isAsc = arr[start] < arr[end];

	        while(start <= end) {
	            // find the middle element
//	            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
	            int mid = start + (end - start) / 2;

	            if (arr[mid] == target) {
	                return mid;
	            }

	            if (isAsc) {
	                if (target < arr[mid]) {
	                    end = mid - 1;
	                } else {
	                    start = mid + 1;
	                }
	            } else {
	                if (target > arr[mid]) {
	                    end = mid - 1;
	                } else {
	                    start = mid + 1;
	                }
	            }
	        }
	        return -1;
	    }
}
