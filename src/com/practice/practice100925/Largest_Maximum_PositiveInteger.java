package com.practice.practice100925;

import java.util.HashSet;

//  LeetCode 2441. Largest(Maximum) Positive Integer That Exists With Its Negative

public class Largest_Maximum_PositiveInteger {

	public static void main(String[] args) {
		int nums[] = { -1, -2, 3, 1 ,2};
		int result = findMax(nums);
		System.out.println("Largest positive integer with its negative: " + result);
	}

	private static int findMax(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		int max = -1;

		
		for (int n : nums) {
			set.add(n);
		}

		for (int n : nums) {
			if (set.contains(n) && set.contains(-n)) {
				if (n > max) {
					max = n;
				}
			}
		}

		return max;
	}

}
