package com.test;

public class SumOfDigit {

	public static void main(String[] args) {
		
		int num=321,r,sum=0;
		
		while(num>0)
		{
			r=num%10;
			sum+=r;
			num=num/10;
		}
		
		System.out.println(sum);
	}
}
