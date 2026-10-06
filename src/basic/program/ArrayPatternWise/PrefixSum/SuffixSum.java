package basic.program.ArrayPatternWise.PrefixSum;

import java.util.Arrays;

public class SuffixSum {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 8, 10 };
		int n = arr.length;
		int[] suffix = new int[arr.length];

		suffix[n - 1] = arr[n - 1];
//		System.out.print(Arrays.toString(suffix));
		for (int i = n - 2; i >= 0; i--) {

			suffix[i] = suffix[i + 1] + arr[i];
		}
		System.out.println(Arrays.toString(suffix));
	}
}

class prefix {
public static void main(String[] args) {
	System.out.println("Vivek Joshi");
}
}
