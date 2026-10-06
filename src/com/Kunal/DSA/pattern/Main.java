package com.Kunal.DSA.pattern;

public class Main {

	public static void main(String[] args) {
		int n = 5;
		pattern1(n);
		System.out.println("********************************");
		pattern2(n);
		System.out.println("********************************");
		pattern3(n);
		System.out.println("********************************");
		pattern4(n);

		System.out.println("********************************");
		pattern5(n);
		System.out.println("********************************");
		pattern6(n);
		System.out.println("********************************");
		pattern7(n);
	}

	private static void pattern7(int n) {
		
		for (int row = 1; row <= n; row++) {
			
		}
		
	}

	private static void pattern6(int n) {

		for (int row = 0; row < 2 * n; row++) {

			int totalColsInRow = row > n ? 2 * n - row : row;
			int numberOfSpaces= n-totalColsInRow;
			for (int i = 0; i < numberOfSpaces; i++) {
				System.out.print(" ");
			}
				
			for (int col = 0; col < totalColsInRow; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void pattern5(int n) {

		// int n=9;

		for (int row = 0; row < 2 * n; row++) {

			int totalColsInRow = row > n ? 2 * n - row : row;
				
			for (int col = 0; col < totalColsInRow; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	private static void pattern4(int n) {

		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {

				System.out.print(col + " ");

			}
			System.out.println();
		}

	}

	private static void pattern3(int n) {
		for (int row = 1; row <= n; row++) {

			for (int col = 1; col <= n - row + 1; col++) {

				System.out.print("* ");
			}
			System.out.println();
		}

	}

	private static void pattern2(int n) {

		for (int row = 1; row <= n; row++) {

			for (int col = 1; col <= n; col++) {

				System.out.print("* ");
			}
			System.out.println();
		}

	}

	private static void pattern1(int n) {

		for (int row = 1; row <= n; row++) {

			for (int col = 1; col <= row; col++) {

				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
