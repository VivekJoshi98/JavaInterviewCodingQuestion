package com.test.BinarySearch;

import java.util.Arrays;

public class FirstAndLastPositionOfElement {
	
	public static void main(String[] args) {
		int []arr = {5,7,7,8,8,10};
		int target=8;
		
//		int[] firstAndLastPosition = firstAndLastPosition(arr, target);
//		System.out.println(Arrays.toString(firstAndLastPosition));
		
		
		int[] usingLinearSearch = usingLinearSearch(arr, target);
		System.out.println(Arrays.toString(usingLinearSearch));
		
		
	}

	private static int[] usingLinearSearch(int[] arr,int target) {
		
		int start=0;
		int end=arr.length-1;
		int left=-1;
		int right=-1;
		while(start<=end)
		{
			if(target==arr[start] && left==-1)
			{
				left=start;
			}
			else
				start++;
			
			if(target==arr[end] && right==-1)
			{
				right=end;
			}
			else
				end--;
		}
		return new int[]{left,right};
		
	}

	private static int[] firstAndLastPosition(int[] arr, int target) {
		int[] ans= {-1,-1};
		int start = search(arr,target,true);
		int end = search(arr,target,false);
		
		ans[0]=start;
		ans[1]=end;
		
		return ans;
		
	}

	private static int search(int[] arr, int target, boolean findIndex) {
		int ans=-1;
		int start=0;
		int end=arr.length-1;
		
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			
			if(target>arr[mid])
			{
				start=mid+1;
			}
			else if(target<arr[mid])
			{
				end=mid-1;
			}
			else
			{
				ans=mid;
				if(findIndex)
				{
					end=mid-1;
				}
				else
				{
					start=mid+1;
				}
			}
		}
		return ans;
		
	}
}
