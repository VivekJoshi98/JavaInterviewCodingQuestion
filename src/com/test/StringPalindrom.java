package com.test;

public class StringPalindrom {

	public static void main(String[] args) {
		
		String str="MAM",rev="",temp=str;
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
	
		if(temp.equals(rev))
		{
			System.out.println("String are palindrom");
		}
		else
		{
			System.out.println("String are not palindrom");
		}
	}
}
