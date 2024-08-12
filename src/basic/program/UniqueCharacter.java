package basic.program;

import java.util.Arrays;

public class UniqueCharacter {

	public static boolean hasUniqueCharacter(String str)
	{
		     char[] charArray = str.toCharArray();
		     System.out.print(charArray);
		     Arrays.sort(charArray);
		   //  System.out.println(charArray.length);
		  System.out.println();
		     System.out.print(charArray);
		     System.out.println();
		     
		     for(int i=0;i<charArray.length-1;i++)
		     {
		    	 if(charArray[i]==charArray[i+1])
		    	 {
		    		 return false;
		    	 }
		     }
		
		return true;
	}
	
	public static void main(String[] args) {
		//hasUniqueCharacter("vivekjoshi");
//		 String input1 = "abcdefg";
//	        String input2 = "hello";
//
//	        System.out.println("Input1 has unique characters? " + hasUniqueCharacter(input1));
//	        System.out.println("Input2 has unique characters? " + hasUniqueCharacter(input2));
	        
	        System.out.println("Input has unique characters  "+hasUniqueCharacter("vajdke"));
	}
}
