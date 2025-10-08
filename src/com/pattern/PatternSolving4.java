package com.pattern;

public class PatternSolving4 {

	public static void main(String[] args) {
		
		char endChar = (char) ('A' + 5 -1); // Calculate the ending character dynamically

		for(char i='A';i<=endChar;i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(" "+j);
			}
			
			System.out.println("");
		}
	}	
}