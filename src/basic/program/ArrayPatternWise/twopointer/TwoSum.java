package basic.program.ArrayPatternWise.twopointer;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int arr[]= {2,7,11,15};
		int target=9;
//		int[] twoSum = twoSum(arr,target); // Optimised approach
//		System.out.println(Arrays.toString(twoSum));
//		
//		int[] twoSumUsingBruteforce = twoSumUsingBruteforce(arr,9);
//		System.out.println(Arrays.toString(twoSumUsingBruteforce));
		
		
		int[] twoSumUsingHashmap = twoSumUsingHashmap(arr,target);
		System.out.println(Arrays.toString(twoSumUsingHashmap));
		
	} 

	private static int[] twoSumUsingHashmap(int[] arr, int target) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			int req_num=target - arr[i];
			
			if(map.containsKey(req_num))
			{
				return new int[] {map.get(req_num),i};
			}
				 
			map.put(arr[i], i);
		}
		
		return new int[] {-1,-1};
	}

	private static int[] twoSum(int[] arr, int target) {
		// Optimised approach
		int left=0;
		int right=arr.length-1;
		
		while(left<right)	
		{
			int sum=arr[left]+arr[right];
			if(sum==target)
			{
				return new int[] {left+1,right+1};
			}
			else if(sum>target)
			{
				right--;
			}
			else
			{
				left++;
			}
		}
		return new int[] {-1,-1};
	}
	
	private static int[] twoSumUsingBruteforce(int[] arr, int target) {
		
		// BruteForce Approach 
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				int sum=arr[i]+arr[j];
				if(sum==target)
				{
					return new int[] {i+1,j+1};
				}
			}
		}
		return new int[] {-1,-1};
		
	}
	
	
	
	
}
