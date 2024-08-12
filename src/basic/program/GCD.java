 package basic.program;

import java.util.Scanner;
                    // GCD & HCF are same.
public class GCD {// Greatest Common Divisor  & Highest Common Factor

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

   //     int gcd = calculateGCD(num1, num2);
        int gcd = calGCD(num1, num2);

        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd); 
        scanner.close();
    }

    public static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calculateGCD(b, a % b);
        }
    }
    
    public static int calGCD(int a, int b) {
       
    	int gcd=1,lcm=0;
    	int oa=a,ob=b;
    	for(int i=2;i<=a && i<=b;++i)
    	{
    	//	System.out.println(i);
    	 // check if i perfectly divides both a and b
    		if(a%i==0 && b%i==0)
    		{
    			System.out.println(i);	
    			gcd=i;
    			lcm=(oa*ob)/gcd;
    		}
    		
    		
    	}
    	System.out.println("LCM of " +oa+ " and "+ ob+ " is "+lcm );
    	return gcd;
    }
    
    

}
