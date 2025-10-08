package basic.program;

import java.util.Scanner;

public class Swap_Two_Number {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter value in a : ");
		a = sc.nextInt();
		System.out.print("Enter value in b : ");
		b = sc.nextInt();
		
//		
//		c=a;
//		a=b;
//		b=a;
//		
//		System.out.println("***************|AFTER SWAPING|*****************");
//		System.out.println("After swap Value of a : "+a);
//		System.out.println("After swap Value of b : "+b);
		
		
		
		WithoutThirdVariable(a, b);
		
		sc.close();

	}
	public static void WithoutThirdVariable(int a, int b)
	{
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.println("After Swapping A and B is "+a+" "+b);
	}
}