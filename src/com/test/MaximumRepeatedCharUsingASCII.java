package com.test;

public class MaximumRepeatedCharUsingASCII {
	
	public static void main(String[] args) {
		
		String str="abbccc";
		
		char maxChar=' ';
		int maxValue=0;
		
		
		int []arr=new int[256];
		
//		HashMap<Character, Integer> count=new HashMap<>();
	
		char[] charArray = str.toCharArray();
		
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
			
		
		System.out.println("Maximum Repeated charcter is "+maxChar);  
	}

}
