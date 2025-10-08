package com.practice.practice030925;

import java.util.Arrays;

public class UniqueCharacter {

	public static void main(String[] args) {

		System.out.println("This is unique character :: "+uniqueCharacter("joshi"));
	}

	private static boolean uniqueCharacter(String str) {
		
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		
		System.out.println(charArray);
		
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
