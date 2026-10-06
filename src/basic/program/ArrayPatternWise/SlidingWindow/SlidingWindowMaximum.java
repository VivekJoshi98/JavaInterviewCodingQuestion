package basic.program.ArrayPatternWise.SlidingWindow;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		int arr[]= {1,3,-1,-3,5,3,6,7};
		int k=3;
		
		slidingWinMax(arr,k); // Bruteforce 
		int[] slidingWinMaxBest = slidingWinMaxBest(arr,k); // best approach
		
		System.out.println(Arrays.toString(slidingWinMaxBest));
	}

	private static void slidingWinMax(int[] arr, int k) {
		
		int newArray[]= new int[arr.length-k+1];
		for (int left = 0; left <= arr.length-k; left++) {
			int max=arr[left];
			for (int right = left; right <left+k; right++) {
				max=Math.max(max, arr[right]);
			}
			newArray[left]=max;
		}
		System.out.println(Arrays.toString(newArray));
	}
	
	
	private static int[] slidingWinMaxBest(int[] arr, int k) {
		
		int n=arr.length;        //{1,3,-1,-3,5,3,6,7}
		
		int[] result = new int[n-k+1];
		
		Deque<Integer> deque=new LinkedList<>();
		
		for(int right=0;right<n;right++)
		{
				while(!deque.isEmpty() && deque.peekFirst()<=right - k) // It removes indices that are no longer inside the current window.
				{
					deque.pollFirst();
				}
				
			while(!deque.isEmpty() && arr[deque.peekLast()]< arr[right])//Remove all smaller elements from the back of the deque because they can never become the maximum.
			{
				deque.pollLast();
			}
			
			deque.addLast(right);
			
			if(right >=k-1) // When the window is complete, store the maximum element of that window in the result array.
			{
				result[right-k+1]= arr[deque.peekFirst()]; 
			}
		}    
		return result;
	}

}
