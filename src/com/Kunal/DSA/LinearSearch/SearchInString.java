package com.Kunal.DSA.LinearSearch;

public class SearchInString {
	public static void main(String[] args) {
		String name = "vivek";
		char target = 'e';

		searchUsingCharAt(name, target);
		searchUsingToCharArray(name,target);
	}

	private static void searchUsingToCharArray(String name, char target) {
		
		char[] charArray = name.toCharArray();
		
		for(char c:charArray)
		{
			if(c==target)
			{
				System.out.println(c);
			}
		}
		
	}

	private static void searchUsingCharAt(String name, char target) {

		for (int i = 0; i <= name.length() - 1; i++) {
			if (target == name.charAt(i)) {
				System.out.println(i);
			}
		}
	}
}
