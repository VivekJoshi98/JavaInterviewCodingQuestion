package basic.program;

import java.util.Scanner;

public class SumOfDigit {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :- ");
		int number=sc.nextInt();
		SumOfDigit.sumOfDigit(number);
		sc.close();
	}
	
	private static void sumOfDigit(int n){
		int sum=0,r;
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println("Sum Of Digit "+sum);
		
	}
}
