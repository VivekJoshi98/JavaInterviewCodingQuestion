package com.Kunal.DSA.LinearSearch;

public class FindEvenNoOfDigit {

	public static void main(String[] args) {

		int arr[] = { 45, 333, 2, 3232, 36, 3, 33, 232 };

//		int evenDigit = findNumber(arr);
		
//		System.out.println(evenDigit);
		
		System.out.println(findDigit(-55445));
		
	}

	private static int findNumber(int arr[]) {
		int count=0;
		
		for(int num:arr)
		{
			if(even(num))
			{
				count++;
			}
		}
		return count;
	}
	private static boolean even(int num) {
     
		int digit = findDigit(num);
		
//		if(digit%2==0)
//		{
//			return true;
//		}
//		return false;
		return digit%2==0;
		
	}

	private static int findDigit(int num) {

		if(num<0)
		{
			num=num*-1;
		//	System.out.println(num);
		}
		
		if(num==0)
		{
			return 1;
		}
		int count = 0;

		while (num > 0) {
			count++;
			num = num / 10;
		}
		return count;
	}

}
