package com.practice.practice030925;

public class CountWord {

	public static void main(String[] args) {
		String word="Java is programming language";
		
		String[] split = word.split(" ");
		int len = split.length;
		
		System.out.println(len);
		
	}
}
