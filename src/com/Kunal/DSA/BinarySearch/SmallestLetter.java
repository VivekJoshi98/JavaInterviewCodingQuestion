package com.Kunal.DSA.BinarySearch;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class SmallestLetter {
// 744. Find smallest letter greater than the target
	public static void main(String[] args) {
		
		char letter[]= {'c','f','j'};
		char target='j';
		char binarySearch = nextGreatestLetter(letter,target);
		System.out.println(binarySearch);
	}

	//return the index of smallest no >target
	private static char nextGreatestLetter(char[] letter, char target) {
		
		int start=0;
		int end=letter.length-1;
		
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			
			if(target<letter[mid])
			{
				end=mid-1;
				
			}
			else
			{
				start=mid+1;
			}
		}
		
		return letter[start % letter.length];
		
	}
}
