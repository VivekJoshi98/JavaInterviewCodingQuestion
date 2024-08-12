package basic.program;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[]s)
	{
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		boolean leap=false;
		
		if(year%4==0)
		{
			if(year%100==0)  //checking for century year
			{
				if(year%400==0)
				{
					leap=true;
				}
				else
				{
					leap=false;
				}
			
			}
			else
			{
				leap =true; //making leap year true for non century years
			}
			
		}
		if(leap)
		{
			System.out.println(year +" is a Leap Year");
		}
		else
		{
			System.out.println(year +" is not a Leap Year");
		}
		
	}
	
}
