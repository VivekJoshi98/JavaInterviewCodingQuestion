package com.practice.practice030925;

public class ArmStrongNo {

	public static void main(String[] args) {
		int num=153,r,sum=0;
		int orignal=num;
		
		
		while(num>0)
		{
			r=num%10;
			sum=sum+r*r*r;
			num=num/10;
			
		}
		
		if(sum==orignal)
		{
			System.out.println("No is armstrong "+sum);
		}
		else
			System.out.println("No is not armstrong "+sum);
	}
}
