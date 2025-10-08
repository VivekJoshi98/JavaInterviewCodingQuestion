package com.practice.practice030925;

public class SumOfDigit {

	public static void main(String[] args) {
		
		int num=2456,sum=0,r;
		
		while(num>0)
		{
			r=num%10;
			sum=sum+r;
			num=num/10;
		}
		
		System.out.println("Sum of digit : "+sum);
	}
}
