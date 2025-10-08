package com.practice.practice100925;

public class Solution {
    public static int missingNumber(int[] nums) {
        
        int n=nums.length;
        System.out.println("Length :: "+n);
        int actualSum=0;

        for(int s:nums)
        {
            actualSum=actualSum+s;
        }
       
        int expectedSum=n*(n+1)/2;

        return expectedSum - actualSum;

    }
    
    
    public static void main(String[] args) {
		
    	int nums[]= {0,1,2,4,5};
    	int missingNumber = missingNumber(nums);
    	System.out.println(missingNumber);
	}
}