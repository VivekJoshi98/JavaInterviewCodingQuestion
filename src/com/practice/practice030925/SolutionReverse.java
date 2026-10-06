package com.practice.practice030925;

import java.util.Iterator;

public class SolutionReverse {

	public static void main(String[] args) {

		String name = "Vivek        Joshi       ";
	//String reverseString = reverseString(name);
//
//		reverseWord(name);
		
//		reverseStringNotWord(name);
		reverseStringAndWord(name);
	}

	private static void reverseStringNotWord(String name) {
		
		String[] split = name.split(" +");
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < split.length; i++) {	
			
			sb.append(reverseString(split[i]));
			sb.append(" ");
			
		}
		System.out.println(sb);
	}
	
private static void reverseStringAndWord(String name) {
		
		String[] split = name.trim().split(" +");
		StringBuilder sb=new StringBuilder();
		for (int i = split.length-1; i >=0; i--) {	
			
			sb.append(reverseString(split[i]));
			sb.append(" ");
			
		}
		System.out.println(sb);
	}

	private static void reverseWord(String name) {

		String[] split = name.split(" +");

//		String result = "";
		StringBuilder result = new StringBuilder();
		for (int i = split.length - 1; i >= 0; i--) {
			result.append(split[i]);
			
			result.append(" ");
		}

		System.out.println(result);
	}

	private static StringBuilder reverseString(String name) {

		int length = name.length();
//		String rev="";
		StringBuilder rev = new StringBuilder();
		for (int i = length - 1; i >= 0; i--) {
			// rev = rev + name.charAt(i);
			rev.append(name.charAt(i));
		}
//		System.out.println(rev.toString());
		
		return rev;

	}
}
