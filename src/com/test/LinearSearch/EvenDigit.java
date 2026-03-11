package com.test.LinearSearch;

public class EvenDigit {

	public static void main(String[] args) {

		int arr[] = { -12, 345, 2, 46, 7896 };

		findNumber(arr);

	}

	private static void findNumber(int[] arr) {

		int count = 0;
		for (int i : arr) {
			if (even(i)) {
				count++;
			}
		}
		System.out.println("Number of even digit is : " + count);
	}

	private static boolean even(int even) {

		int findDigit = findDigit(even);

		return findDigit % 2 == 0;

	}

	private static int findDigit(int num) {

		if (num < 0) {
			num = num * -1;
			// System.out.println(num);
		}

		if (num == 0) {
			return 1;
		}

		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;
		}
		return count;
	}

//	private static int findDigit(int[] arr) {
//		int count = 0;
//		int c = 0;
//		for (int num : arr) {
//			while (num > 0) {
//				count++;
//				num = num / 10;
//
//			}
//			if (count % 2 == 0) {
//				c++;
//			}
//
//			count = 0;
//
//		}
//		return c;
//
//	}
}
