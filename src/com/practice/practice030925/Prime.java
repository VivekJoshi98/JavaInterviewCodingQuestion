package com.practice.practice030925;

public class Prime {

	public static void main(String[] args) {
		
		int num=11;
		boolean prime=false;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				prime=true;
				break;
			}
		}
		
		if(prime)
		{
			System.out.println("No is not prime");
		}
		else
		{
			System.out.println("No is prime");
		}
	}
}
