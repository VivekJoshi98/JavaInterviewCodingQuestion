package com.practice.practice100925;

public class FindEvenNoDigit {

	public static void main(String[] args) {
		
		int arr[]= {12,-456,1,2,8794,-123134,4565};
		
		System.out.println(countEvenDigit(arr));
	//	System.out.println(digit(-123));
	}

	private static int countEvenDigit(int[] arr) {
		
		int count=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(evenNo(arr[i]))
			{
				count++;
			}
		}
		return count;
		
	}
	
	private static boolean evenNo(int n) {
		
		int no=digit(n);
		if(no%2==0)
		{
		   return true;
		}
		return false;
	}
		

	private static int digit(int n) {
		
		if(n<0)
		n=n * -1;
		
		if(n==0)
			return 1;
	
		int count=0;	
		while(n>0)
		{
			count++;
			n=n/10;
		}
		return count;
//		System.out.println(count);
		
	}
}
