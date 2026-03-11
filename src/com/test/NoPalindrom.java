package com.test;

public class NoPalindrom {

	public static void main(String[] args) {
		
		int num=121,temp=num,r,rev=0;
		
		while(num>0)
		{
			r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
		
		if(rev==temp)
		{
			System.out.println("No is palindrom");
		}
		else
		{
			System.out.println("No is not palindrom");
		}
	}
}
