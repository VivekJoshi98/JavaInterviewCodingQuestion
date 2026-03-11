package com.test;

public class FibonacciSeries {

	
	public static void main(String[] args) {

		int num=11;
		int a=0,b=1,c;
	//	int sum=0;
		for(int i=0;i<=num;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}
}
