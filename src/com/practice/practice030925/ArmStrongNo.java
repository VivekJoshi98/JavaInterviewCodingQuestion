package com.practice.practice030925;

public class ArmStrongNo {

	public static void main(String[] args) {
		
		int number=153,r,sum=0,orignal=number;
		
		while(number>0)
		{
			r=number%10;
			sum=sum+r*r*r;
			number=number/10;
		}
		
		if(orignal==sum)
		{
			System.out.println("No is armstrong "+orignal+" : "+sum);
		}
		else
		{
			System.out.println("No is not armstrong "+orignal+" : "+sum);
		}
	}
}
