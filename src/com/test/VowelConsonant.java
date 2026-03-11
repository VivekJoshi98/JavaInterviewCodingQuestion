package com.test;

public class VowelConsonant {

	public static void main(String[] args) {
		
		String str="thisisjavaprogramming";
		
		int vowel=0;
		int consonant=0;
		
		char[] charArray = str.toLowerCase().toCharArray();
		for(char c:charArray)
		{
			if(c=='a'|| c=='e'|| c=='i'||c=='o'||c=='u')
			{
				vowel++;
			}
			else
			{
				consonant++;
			}
		}
		
		System.out.println("Vowel :"+vowel+"\n"+"Consonant : "+consonant);
		
		
	}
}
