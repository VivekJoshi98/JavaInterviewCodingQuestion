package com.test;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		
		String str1="LISTEN";
		String str2="SILENT";
		
		if(stringAnagram(str1,str2))
		{
			System.out.println("String is anagram");
		}
		else
		{
			System.out.println("String is not anagram");
		}
	}

	private static boolean stringAnagram(String str1, String str2) {
		
		if(str1.length()!=str2.length())
		{
			return false;
		}
		
		else
		{
			char[] char1 = str1.toCharArray();
			char[] char2 = str2.toCharArray();
			
			Arrays.sort(char1);
			Arrays.sort(char2);
			
			if(Arrays.equals(char1, char2))
			{
				return true;
			}
			else
			{
				return false;
			}
			
			
		}
		
	}
		

}
