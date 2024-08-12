package basic.program.Array;

import java.util.Scanner;

public class FindMissingNo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array : ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the elements : ");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}
		

		int findMissingNo = findMissingNo(arr);
		System.out.println("Missing no in an array is : "+findMissingNo);

	}

	private static int findMissingNo(int arr[]) {

		int n = arr.length;
		int actualSum = 0;

		for (int s : arr) {
			actualSum = actualSum + s; // calculate the sum of an array
		}

		int expectedSum = n * (n + 1) / 2;

		// The missing number is the difference between the expected sum and the actual
		// sum
		return expectedSum - actualSum;

	}
}
