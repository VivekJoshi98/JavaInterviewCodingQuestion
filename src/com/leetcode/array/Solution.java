package com.leetcode.array;

public class Solution {
	/*
	 * input s="abba"
	 * output:1 
	 * 
	 * input s="abc"
	 * output:0
	 * 
	 * time Complexity : O(Len.of S)
	 * space Complexity : O(1)
	 */

	public static void main(String[] args) {
		 
		int reverse = reverse();
		System.out.println(reverse);
	}
	
	static public int reverse() {
		
		String s="abc";
		String rev="";
		
		char[] charArray = s.toCharArray();
		
		for(int i=charArray.length-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
//		System.out.println(rev);
		
		if(rev.equals(s))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
