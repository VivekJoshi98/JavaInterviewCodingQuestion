package com.practice.practice030925;

public class Reverse {

	public static void main(String[] args) {
		
		String str=" Hello World ";
		
//		String reverseString = reverseString(str);
//		System.out.println(reverseString.trim());
//		String reverseWord = reverseWord(str);
//		System.out.println(reverseWord.trim());
		
		reverseStringOrWord(str);

	}

	private static void reverseStringOrWord(String str) {
		
		
		String reverseWord = reverseWord(str);
	//	String reverseString = reverseString(reverseWord).trim();
		System.out.println(reverseWord);
		
	}

	private static String reverseWord(String str) {
		
		String[] split = str.split(" +");
		StringBuilder sb=new StringBuilder();
		for(int i=split.length-1;i>=0;i--)
		{
			String rev = reverseString(split[i]);
			sb.append(rev);
			sb.append(" ");
		}
		return sb.toString();
	}

	private static String reverseString(String str) {

			String rev="";
			
			for(int i=str.length()-1;i>=0;i--)
			{
				rev=rev+str.charAt(i);
			}
			return rev;
		
	}
	
	
	
}
