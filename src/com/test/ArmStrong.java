package com.test;

public class ArmStrong {
	
	public static void main(String[] args) {
		int num=152;
		int findArmStrong = findArmStrong(num);
		System.out.println(findArmStrong);
	}

	private static int findArmStrong(int num) {
			int r,sum=0,temp=num;
		while(num>0)
		{
			r=num%10;
			sum=sum+r*r*r;
			num=num/10;
		}
		
		if(sum==temp)
		{
			return sum;
		}
		else
		{
			return -1;
		}
		
	}
}
