package basic.program.practice;

import java.util.Arrays;

public class StringAnagram {

	
public static void main(String[] args) {
	
	String s1="vivek";
	String s2="keviv";
	
	anagram(s1,s2);
}

	static public void anagram(String str1,String str2) {
		
		if(str1.length()==str2.length())
		{
			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();
			
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			if(Arrays.equals(charArray1, charArray2))
			{
				System.out.println("String is anagram");
			}
			else
			{
				System.out.println("String is not anagram");
			}
			
		}

	}
}
