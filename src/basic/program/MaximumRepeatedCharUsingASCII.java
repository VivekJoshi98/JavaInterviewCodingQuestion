package basic.program;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumRepeatedCharUsingASCII {

	public static void main(String[] args) {
		
		int maxValue=0;
		char maxChar=' ';
		String s="vivek";
		int[] arr=new int[256];
		char[] charArray = s.toCharArray();
		
		for(char c:charArray)
		{
			arr[c]++;
		}
		
//		System.out.println(Arrays.toString(arr));
		
		for(char c:charArray)
		{
			if(arr[c]>maxValue)
			{
				maxValue=arr[c];
				maxChar=c;
			}
			
		}
		
//		ArrayList<Character> list=new ArrayList<Character>();
//		
//		for(int i=0;i<=arr.length-1;i++)
//		{
//			if(arr[i]==maxValue)
//			{
//				list.add((char) i);
//			}
//		}
		
//		if(list.size()>1)
//		{
//			System.out.println("Maximum charcter of occurence "+maxValue +" are ");
//			for(char c:list)
//			{
//				System.out.print("'"+c+"'");
//			}
//		}
//		else
//		{
//			System.out.println("Character with the maximum occurrence is '" + list.get(0)+ "' with a count of " + maxValue);
//		}
		System.out.println("Maximum repeated character is "+maxChar);
	}
}
