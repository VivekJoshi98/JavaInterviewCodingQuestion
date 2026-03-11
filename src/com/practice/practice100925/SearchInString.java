package com.practice.practice100925;

public class SearchInString {

	public static void main(String[] args) {
		
		String name="vivek";
		char target='e';
		searchInString(name,target);
		
	}

	private static void searchInString(String name,char target) {		
		char[] charArray = name.toCharArray();
		int count=0;
		for(int i=0;i<=charArray.length-1;i++)
		{
			if(charArray[i]==target)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("Element is not found in the String");
		}
		else
		{
			System.out.println("The element " + target + " found " + count + " times in the string.");
		}
	}
}
