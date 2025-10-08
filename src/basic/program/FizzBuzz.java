package basic.program;

import java.util.Scanner;

public class FizzBuzz {

	public static void fizzBuzz(int n) {

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) // it will print fizzbuzz
			{
				System.out.println("FizzBuzz " + i);
			} else if (i % 3 == 0) // it will print Fizz
			{
				System.out.println("Fizz " + i);
			} else if (i % 5 == 0) { // it will print Buzz
				System.out.println("Buzz " + i);
			}
			else
				System.out.println(i);
		}
	   
	}
	public static void main(String[] args) {
		int  number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :-- ");
		number=sc.nextInt();
		fizzBuzz(number);
		sc.close();
	}
}
