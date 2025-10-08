package com.practice.practice030925;

public class StringPalindrom {

	public static void main(String[] args) {
		
		String name="viv",rev="",orignal=name;
		
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
	//	System.out.println(rev);
		
		if(rev.equals(orignal))
		{
			System.out.println("String is palindrom");
		}
		else		
			System.out.println("String is not palindrom");

	}
	
}

