package com.test.LinearSearch;

public class SearchInString {

	public static void main(String[] args) {
		
		String name="joshi";
		char target='s';
		
		System.out.println(search(name,target));
	}

	private static int search(String str, char target) {
	
		if(str.length()==0)
		{
			return -1;
		}
		for(int i=0;i<str.length();i++)
		{
			if(target==str.charAt(i))
			{
				return i;
			}
		}
		return -1;
	}

}
