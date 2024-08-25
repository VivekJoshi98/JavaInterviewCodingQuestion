package com.Kunal.DSA.BinarySearch;

public class InfiniteArray {
// find position of an element in a sorted array of infinite number
	public static void main(String[] args) {

		 int[] arr = {1,2,3, 5, 7, 9, 10, 90,
	                100, 130, 140, 160, 170,180,190,210};
	        int target = 10;
		System.out.println(ans(arr, target));
	}
	
	static int ans(int[] arr,int target) {
		int start=0;
		int end=1;
											//			0 1	2 3 4 5 6 7 8
		//Condition for the target to lie in the range [1,2,3,4,5,6,7,8,9]
		while(target>arr[end])
		{
			int newStart=end+1;
			// double the box size
			//end = previous end + sizeofbox *2
			end=end+(end-start+1)*2;
			start=newStart;
		}
		
		return binarySearch(arr, target, start, end);

	}

	static int binarySearch(int[] arr, int target, int start, int end) {

//		int start=0;
//		int end=arr.length-1;

		while (start <= end) {
			// int mid=(start+end)/2;
			int mid = start + (end - start) / 2;

			if (target > arr[mid]) {
				start = mid + 1;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;

	}
}


