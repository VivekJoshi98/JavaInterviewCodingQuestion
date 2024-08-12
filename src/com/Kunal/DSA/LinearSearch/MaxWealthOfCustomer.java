package com.Kunal.DSA.LinearSearch;

public class MaxWealthOfCustomer {

	//LeetCode : 1672. Richest Customer Wealth   
	public static void main(String[] args) {
		
		int [][]accounts = {
							{1,2,3},
							{3,2,1}
		};
		
		int maxSum = maximumWealth(accounts);
		System.out.println(maxSum);
		
	}
	
	 public static int maximumWealth(int[][] accounts) {
	     
		 int ans= Integer.MIN_VALUE;
		
		 for (int i = 0; i < accounts.length; i++) {
			 int sum=0;
			for (int j = 0; j < accounts[i].length; j++) {
				
				sum=sum+accounts[i][j];
				System.out.println(sum);
			}
			
			if(sum>ans)
			 {
				 ans=sum;
			 }
		}
		 
		 return ans;
	    } 
	 
}
