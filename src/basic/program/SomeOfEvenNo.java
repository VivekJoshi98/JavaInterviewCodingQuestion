 package basic.program;

import java.util.Scanner;

public class SomeOfEvenNo {

	public static void main(String []s)
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no :: ");
		int input = sc.nextInt();
		
		for(int i=1;i<=input;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even No :: "+i);
				sum=sum+i;
			}
		}
		
		System.out.println("Sum of Even No :: "+sum);
	}
}
