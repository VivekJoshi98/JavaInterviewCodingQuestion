package com.practice.practice030925;

public class ReverseStringNotWords {

	static String reverseWords(String s)
    {
      String[] split = s.split(" +");
      
      StringBuilder sb=new StringBuilder();

      for(int i=split.length-1;i>=0;i--)
      {
    	 sb.append(split[i]);
    	 
             sb.append(" ");
             
      }
      
      String str = sb.toString().trim();
 //     char[] charArray = str.toCharArray();
      
      String rev="";
      
      for(int i=str.length()-1;i>=0;i--)
      {
    	  rev=rev+str.charAt(i);
      }
      
      return rev.trim();
    }
	
	public static void main(String[] args) {
		
		String reverseWords = reverseWords("Hello World vivek joshi ");
//		String rev="";
//		for(int i=reverseWords.length()-1;i>=0;i--)
//		{
//			rev=rev+reverseWords.charAt(i);
//		}
//		System.out.println(rev);
		System.out.println(reverseWords);
	}
}
