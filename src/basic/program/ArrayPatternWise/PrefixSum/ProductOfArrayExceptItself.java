package basic.program.ArrayPatternWise.PrefixSum;

import java.util.Arrays;

public class ProductOfArrayExceptItself {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4 };
		bruteForce(arr); //
		optimized1(arr); // using three array
		optimized2(arr); // using one array
	}

	private static void optimized2(int[] arr) {
		
		int[] result= new int[arr.length];
		
		// prefix
		result[0]=1;
		for (int i = 1; i < arr.length; i++) {
			result[i]=result[i-1]*arr[i-1];
		}
		
		// suffix
		int suffix=1;
		for (int i = arr.length-1; i >=0; i--) {
			result[i]=result[i]*suffix;
			suffix*=arr[i];
		}
					
		System.out.println(Arrays.toString(result));
	}

	private static void optimized1(int[] arr) {

		int[] prefix = new int[arr.length];
		int[] suffix = new int[arr.length];
		
		int[] result=new int[arr.length];
		
		prefix[0]=1;
		suffix[arr.length-1]=1;
		
		for (int i = 1; i < arr.length; i++) {
			prefix[i]=prefix[i-1]*arr[i-1];
		}
		
		for (int i = arr.length-2; i >=0; i--) {
			suffix[i]=suffix[i+1]*arr[i+1];
		}
		
		for (int i = 0; i < arr.length; i++) {
			result[i]=prefix[i]*suffix[i];
		}
		
		System.out.println(Arrays.toString(result));

	}

	private static void bruteForce(int[] arr) {

		int[] newArray = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int product = 1;
			for (int j = 0; j < newArray.length; j++) {

				if (i != j) {
					product *= arr[j];
				}
			}
			newArray[i] = product;
		}

		System.out.println(Arrays.toString(newArray));
	}
}
