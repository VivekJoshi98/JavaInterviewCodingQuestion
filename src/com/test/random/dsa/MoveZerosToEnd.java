package com.test.random.dsa;

import java.util.Arrays;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		int[] nums = { 2, 0, 4, 1, 0, 8 };
		System.out.println(Arrays.toString(solution(nums)));
	}

	private static int[] solution(int nums[]) {
		int left=0;
		for(int right=0;right<nums.length;right++)
		{
			if(nums[right]!=0)
			{
				int temp=nums[right];
				nums[right]=nums[left];
				nums[left]=temp;
				left++;
			}
		}
		
		return nums;
	}

}
