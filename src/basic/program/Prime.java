package basic.program;

import java.util.Scanner;

public class Prime {

	public static void main(String[]s)
	{
		// prime no is that no which is divisible by 1 and itself
		Scanner sc=new Scanner(System.in);
		int value = sc.nextInt();
		boolean prime=true;
		for(int i=2;i<value;i++)
		{
			if(value%i==0)
			{
				prime=false;
				break;
			}
		}
		if(prime)
		{
			System.out.println( value +" Number is prime no.");
		}
		else 
		{
			System.out.println( value +" Number is not prime no.");
		}
	}
}
