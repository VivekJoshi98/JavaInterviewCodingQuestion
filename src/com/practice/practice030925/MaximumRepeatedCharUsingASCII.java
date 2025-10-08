package com.practice.practice030925;

public class MaximumRepeatedCharUsingASCII {

	
	
	public static void main(String[] args) {
		
		String name="ekek";
		int maxValue=0;
		char maxChar=' ';
		
		int arr[]=new int[256];
		char[] charArray = name.toCharArray();
		
		for(char ch:charArray)
		{
			arr[ch]++;
		}
		
		
		for(char c:charArray)
		{
			if(arr[c]>maxValue)
			{
				maxValue=arr[c];
				maxChar=c;
			}
		}
		if(maxValue>1)
		{
			System.out.println("Maximum repeated character is "+maxChar);
		}
		else
			System.out.println("No Repeated character is found");
		
		
	}
}
