package basic.program;

import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[]s)
	{
		int input,evenSum = 0,oddSum=0;
		System.out.println("Enter a No ::: ");
		Scanner sc=new Scanner(System.in);
		input=sc.nextInt();
		
		System.out.println("Even no is :- ");
		for(int i=1;i<=input;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				evenSum=evenSum+i;
			}
			
		}
		System.out.println("Sum of Even number is "+evenSum); 
		
		System.out.println("Odd no is :- ");
		
		for(int i=1;i<=input;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
				oddSum=oddSum+i;
			}
		}
		
		
		System.out.println("Sum of Odd number is "+oddSum);
	}
}
