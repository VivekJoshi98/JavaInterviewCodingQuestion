package com.practice.practice030925;

public class VowelConsonant {

	public static void main(String[] args) {
		vowelConsonant("Mynameisvivekjoshi");
	}

	private static void vowelConsonant(String str) {
		int vCount=0,cCount=0;
		String lowerCase = str.toLowerCase();
		
//		System.out.println(lowerCase);
		char[] charArray = lowerCase.toCharArray();
		
		for(char c:charArray)
		{
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				vCount++;
			}else
			{
				cCount++;
			}
		}
		
		System.out.println("Vowel : "+vCount+" \nConsonent : "+cCount);
	}
}
