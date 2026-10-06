package basic.program.ArrayPatternWise.SlidingWindow;

public class MaxConsecutiveOnesIII { //MaxConsecutiveOnesIII

	public static void main(String[] args) {

		int arr[] = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1 ,0};
		int k = 3;
		int maxOnes = maxConsecutiveOnesIII(arr, k);
		System.out.println(maxOnes);

		int maxOnes2 = maxOnes(arr, k);
		System.out.println(maxOnes2);
	}

	private static int maxOnes(int[] arr, int k) { // Brute Force Solution
		int maxOnes = 0;

		for (int i = 0; i < arr.length; i++) {
			int zeroCount = 0;

			for (int j = i; j < arr.length; j++) {
				if (arr[j] == 0) {
					zeroCount++;
				}

				if (zeroCount > k) {
					break;
				}

				maxOnes = Math.max(maxOnes, j - i + 1);
			}
		}
		return maxOnes;

	}

	private static int maxConsecutiveOnesIII(int[] nums, int k) { // Optimized approach

		int zeroCount = 0;
		int start = 0;
		int maxOne = 0;

		for (int end = 0; end < nums.length; end++) {
			if (nums[end] == 0) {
				zeroCount++;
			}
			while (zeroCount > k) {
				if (nums[start] == 0) {
					zeroCount--;
				}
				start++;
			}
			maxOne = Math.max(maxOne, end - start + 1);
		}
		return maxOne;
	}
}