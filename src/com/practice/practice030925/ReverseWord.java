package com.practice.practice030925;

public class ReverseWord {

	
	public static void main(String[] args) {
		
		String word=" vivek   joshi ";
		
		String[] split = word.split(" +");
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=split.length-1;i>=0;i--)
		{
			sb.append(split[i]);
			sb.append(" ");
		}
		System.out.println(sb.toString().trim());
	}
}
