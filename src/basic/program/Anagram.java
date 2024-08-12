package basic.program;

import java.util.Arrays;

public class Anagram {

//	  An anagram is a word or phrase that's formed by rearranging the letters of 
//    another word or phrase.
	static boolean anagram(String str1,String str2)
	{
		if(str1.length()!=str2.length())
		{
			return false;
		}
		else
		{
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1, ch2))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
	public static void main(String[] arg) {
		
		String str1="vivek";
		String str2="vvkei";
		if(anagram(str1,str2))
		{
			System.out.println("Yes !!"+str1+" and "+str2+" are anagram");
		}
		else
		{
			System.out.println("No !!"+str1+" and "+str2+" are not anagram");
		}
	}

}
