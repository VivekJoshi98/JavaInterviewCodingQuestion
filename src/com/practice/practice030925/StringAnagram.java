package com.practice.practice030925;

import java.util.Arrays;

public class StringAnagram {
	
	
	static boolean anagram(String str1,String str2)
	{
		if(str1.length()!=str2.length())
		{
			System.out.println("String are not an anagram");
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
		return false;
	}
	

	public static void main(String[] args) {
		
		String name1="LISTEN";
		String name2="SILENT";
		
		if(anagram(name1,name2))
		{
			System.out.println("String is anagram");
		}
		else
		{
			System.out.println("String is not anagram");
		}
		
		
	}
}
