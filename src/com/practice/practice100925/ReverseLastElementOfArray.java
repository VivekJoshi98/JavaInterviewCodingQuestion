package com.practice.practice100925;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseLastElementOfArray {

	public static void main(String[] args) {
		String[] str = { "shobhit", "vaibhav", "vivek", "tushar" };

		String lastElement = str[str.length - 1];
		String reverseString = reverseString(lastElement);
		str[str.length-1]=reverseString;
		
		System.out.println(Arrays.toString(str));

	}

	private static String reverseString(String str) {
		
		StringBuilder sb = new StringBuilder(str);
		StringBuilder reverse = sb.reverse();
		return reverse.toString();
	}

}
