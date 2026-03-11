package com.practice.practice.binarySearch090925;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		int arr[] = { 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 , 0, 1, 2 };
		int target = 5;

		int search = search(arr, target);
		System.out.println(search);
		// System.out.println(findPivot);

	}
 
	public static int search(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;
		int findPivotWithDuplicates = findPivotWithDuplicates(arr);
		System.out.println(findPivotWithDuplicates);
		int findPivot = findPivot(arr, start, end);

		if (findPivot == -1) {       
			return binarySearch(arr, target, start, end);
		}
		if (arr[findPivot] == target) {
			return findPivot;
		}

		if (target >= arr[start]) {
			return binarySearch(arr, target, start, findPivot - 1);
		}

		return binarySearch(arr, target, findPivot + 1, end);
	}

	private static int findPivot(int[] arr, int start, int end) {

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			if (mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}

			if (arr[mid] <= arr[start]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;

	}

	static int findPivotWithDuplicates(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			// 4 cases over here
			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			} 
			if (mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}

			// if elements at middle, start, end are equal then just skip the duplicates
			if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
				// skip the duplicates
				// NOTE: what if these elements at start and end were the pivot??
				// check if start is pivot
				if (start < end && arr[start] > arr[start + 1]) {
					return start;
				}
				start++;

				// check whether end is pivot
				if (end > start && arr[end] < arr[end - 1]) {
					return end - 1;
				}
				end--;
			}
			// left side is sorted, so pivot should be in right
			else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

	private static int binarySearch(int[] arr, int target, int start, int end) {

		while (start <= end) {
			int mid = start + (end - start) / 2;  
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}