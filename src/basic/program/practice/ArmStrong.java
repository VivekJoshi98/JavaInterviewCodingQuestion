package basic.program.practice;

import java.util.Scanner;

public class ArmStrong {

//		153=1*1*1+5*5*5+3*3*3
	
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number :: ");
			int n = sc.nextInt();
			int r,sum=0,orig=n;
			while(n>0)
			{
				r = n%10;
				sum+=r*r*r;
				n=n/10;
			}
			
			if(orig==sum)
			{
				System.out.println("No is armStrong");
			}
			else
			{
				System.out.println("No is not armStrong");
			}
			
		}
}
