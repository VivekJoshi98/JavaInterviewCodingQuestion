 package com.practice.practice030925;

public class NoPalindrom {

	public static void main(String[] args) {
		int num= 12221,r,rev=0,orignal=num;
		
		while(num>0)
		{
			r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
		
		if(rev==orignal)
		{
			System.out.println("No is Palindrom");
		}
		else
			System.out.println("No is not palindrom");
	}
}
