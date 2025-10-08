package basic.program;

import java.util.Scanner;

public class TableMultiplication {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :- ");
		int input = sc.nextInt();
		int result;
		
		for(int i=1;i<=10;i++)
		{
			result=input*i;
			System.out.println(input +" x "+ i +" = "+result);
		}

	}

}
