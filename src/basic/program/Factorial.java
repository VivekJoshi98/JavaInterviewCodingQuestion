package basic.program;

import java.util.Scanner;

public class Factorial {

	public static void main(String[]s)
	{
		// 5 = 1*2*3*4*5 
		 
		long fact=1;
		System.out.println("Enter a number :: ");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		
		for(int i=1;i<=input;i++)
		{
			fact=fact*i;
			if(input==i)
			{
				System.out.println( " "+ i);
			}
			else
			{
				System.out.print( " "+ i +" * ");
			}
			
		}
		sc.close();
		System.out.println("Factorial of a given number "+input+" is  : "+fact); 
	}
}
