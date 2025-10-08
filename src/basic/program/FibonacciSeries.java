package basic.program;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[]s)
	{
		//0 1 1 2 3 5 8 13
		int input,a=0,b=1,c;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :: ");
		input = sc.nextInt();
		
		for(int i=1;i<=input;i++)
		{
			System.out.print(a+" ");
			
			c=a+b;
			a=b;
			b=c;
		} 
	sc.close();
		
	}
}
