package com.test;

public class CountWord {

	public static void main(String[] args) {
		String name="My name is vivek Joshi";
		int sum=0;
		String[] split = name.split(" ");
		int length = split.length;
		
		for(String s:split)
		{
			sum++;
		}
		System.out.println(sum);
		System.out.println(length);
	}
}
