package com.test;

import java.util.Arrays;

public class UniqueCharacter {

	public static void main(String[] args) {
		
		String str="joshi";
		
		if(isUniqueChar(str))
		{
			System.out.println("Character is unique in this String");
		}
		else
		{
			System.out.println("Character is not unique in this String");
		}
		
		
	}

	private static boolean isUniqueChar(String str) {
		
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		for(int i=0;i<charArray.length-1;i++)
		{
			if(charArray[i]==charArray[i+1])
			{
				return false;
			}
			
		}
		return true;
		
	}
}
