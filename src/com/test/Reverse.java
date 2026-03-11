package com.test;

public class Reverse {

	public static void main(String[] args) {
		
		String str="Vivek Joshi";
	//	reverseString(str);
	//	reverseWord(str);
		reverseEachWordInSentense(str);
	}

	private static void reverseEachWordInSentense(String str) {
		
		String[] split = str.split(" +");
		String rev="";
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<=split.length-1;i++)
		{
			
			sb.append(reverseString(split[i])).append(" ");
		}
		System.out.println(sb.toString());
	}

	private static void reverseWord(String str) {
		
		String[] split = str.split(" +");
		StringBuilder sb=new StringBuilder();
		
		for(int i=split.length-1;i>=0;i--)
		{
			sb.append(split[i]);
			sb.append(" ");
		}
		System.out.println(sb.toString());
	}

	private static String reverseString(String str) {
		
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
	//	System.out.println(rev);
		return rev;
	}
	
}
























