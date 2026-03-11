package com.test;

public class ArmStrong {

	public static void main(String[] args) {
		
		int num=153,sum=0,r,temp=num;
		
		
		while(num>0)
		{
			r=num%10;
			sum=sum+r*r*r;
			num=num/10;
		}
		System.out.println(sum+"");
		
		if(temp==sum)
		{ 
			System.out.println("No is armstrong.");
		}
		else {
			System.out.println("No is not armstrong");
		}
	}
}
