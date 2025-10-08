package com.practice.practice030925;

public class ReverseStringOrWords {

	public static void main(String[] args) {

		String reverseString = reverseString("Hello World vivek joshi ");

		String reverseWord = reverseWord(reverseString);
		
		System.out.println(reverseWord);
	}

	private static String reverseWord(String reverseString) {

		String[] split = reverseString.split(" +");

		StringBuilder sb = new StringBuilder();

		for (int i = split.length - 1; i >= 0; i--) {
			sb.append(split[i]);
			sb.append(" ");
		}
	//	System.out.println(sb.toString().trim());
		return sb.toString().trim();

	}

	private static String reverseString(String str) {

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		return rev.trim();
	}

}	
