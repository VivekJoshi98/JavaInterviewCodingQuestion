package basic.program.ArrayPatternWise.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

	public static void main(String[] args) {
		int arr[] = { -1, 0, 1, 2, -1, -4 };
		Arrays.sort(arr); // [-4, -1, -1, 0, 1, 2]
		List<List<Integer>> threeSum = threeSum(arr);
		System.out.println(threeSum);

//		List<List<Integer>> threesum = threeSumBruteForce(arr);
//		System.out.println(threesum);

	}

	private static List<List<Integer>> threeSum(int[] arr) {

		List<List<Integer>> res = new ArrayList<>();

		for (int i = 0; i < arr.length - 2; i++) {

			if (i > 0 && arr[i] == arr[i - 1]) {
				continue;
			}
			
			int left = i + 1;
			int right = arr.length - 1;

			int sum = arr[i] + arr[left] + arr[right];
			
			while (left < right) {
				if (sum == 0) {
					List<Integer> triplet = new ArrayList<>();
					triplet.add(arr[i]);
					triplet.add(arr[left]);
					triplet.add(arr[right]);
					res.add(triplet);
					
					while(left < right && arr[left]==arr[left+1])
					{
						left++;
					}
					
					while(left < right && arr[right]==arr[right-1])
					{
						right--;
					}
					
					left++;
					right--;
				} else if (sum < 0) {
					left++;
				} else {
					right++;
				}
			}

		}

		return res;

	}

	private static List<List<Integer>> threeSumBruteForce(int[] arr) {
		Set<List<Integer>> res = new HashSet<>();
		for (int i = 0; i < arr.length - 2; i++) {
			for (int left = 0; left < arr.length - 1; left++) {
				for (int right = 0; right < arr.length; right++) {
					int sum = arr[i] + arr[left] + arr[right];

					if (sum == 0) {
						List<Integer> triplet = Arrays.asList(arr[i], arr[left], arr[right]);
						Collections.sort(triplet);
						res.add(triplet);

					}
				}
			}
		}
		return new ArrayList<>(res);
	}

}