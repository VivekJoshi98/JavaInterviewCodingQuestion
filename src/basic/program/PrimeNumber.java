package basic.program;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[]s)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter number :: ");
		int input = sc.nextInt();	
		int temp=0;	 
		for(int i=2;i<input;i++)
		{
			if(input%i==0)
			{
				temp=temp+1;
			}
		}
		
		
		if(temp==0)
		{
			System.out.println(input+" is prime number !");
		}else
		{
			System.out.println(input+" is not prime number !");
		}
		sc.close();
/*
 * ************************************************************
		boolean prime=true;
		for(int i=2;i<input;i++)
			{
				if(input%i==0)
				{
					prime=false;
					break;
				}
			}
		if(prime)
		{
			System.out.println(input+" is prime number !");
		}
		else
		{
			System.out.println(input+" is not prime number !");
		}
		*******************************************************************
		*/
	}
}
