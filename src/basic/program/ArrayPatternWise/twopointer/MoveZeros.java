package basic.program.ArrayPatternWise.twopointer;

import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {
		
		int[] arr= {0,1,0,3,12};
		
		int left=0;
		
		for(int right=0;right<arr.length;right++)
		{
			if(arr[right]!=0)
			{
				int temp=arr[right];
				arr[right]=arr[left];
				arr[left]=temp;
				left++;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}