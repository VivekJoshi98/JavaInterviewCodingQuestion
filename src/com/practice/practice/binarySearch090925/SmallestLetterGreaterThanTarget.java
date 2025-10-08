package com.practice.practice.binarySearch090925;

public class SmallestLetterGreaterThanTarget {

	public static void main(String[] args) {
		
		char letters[]= {'c','f','j'};
		char target='c';
		
		char nextGreatestElement = nextGreatestElement(letters,target);
		System.out.println(nextGreatestElement);
		
		
	}

	private static char nextGreatestElement(char[] letters, char target) {
		
		int start=0;
		int end=letters.length-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(target<letters[mid])     
			{
				end=mid-1;
			}
			else
			{
				start=mid+1;
			}
		}
		
		return letters[start % letters.length];
	}
}
