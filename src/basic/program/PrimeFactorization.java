package basic.program;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println((2<=1));
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        System.out.print("Prime factorization of " + number + " is: ");
        primeFactorization(number);
    }
    
    public static void primeFactorization(int n)
    {
    	for(int i=2;i<=n;i++)
    	{
    		while(n%i==0)
    		{
    			System.out.print(i+" ");
    			n=n/i;
    		}    		
    	}
    }
}

