package basic.program.ArrayPatternWise.twopointer;

import java.util.Arrays;

public class SortColors {// Sort without using any inBuild liberary's sort function or any sorting
							// algorithm
	public static void main(String[] args) {

		int[] arr = { 2, 0, 2, 1, 1, 0,1,1,1,1,2,2 };
		
		int start=0;
		int mid=0;
		int end=arr.length-1;
		
		while(mid<=end)      
		{
			 if(arr[mid]==0)
			 {
				 arr[mid]=arr[start];
				 arr[start]=0;
				 mid++;
				 start++;
				
			 }
			 else if(arr[mid]==1)
			 {
				 mid++;
			 }
			 else
			 {
				 arr[mid]=arr[end];
				 arr[end]=2;
				 end--;
			 }
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
