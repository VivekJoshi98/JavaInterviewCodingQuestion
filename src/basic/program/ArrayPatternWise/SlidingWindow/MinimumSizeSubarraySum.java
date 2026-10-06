package basic.program.ArrayPatternWise.SlidingWindow;

public class MinimumSizeSubarraySum {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 1, 2, 4, 7 };

//		int ans = minimumSubarraySum(arr);
//		System.out.println(ans);

		int ans = minimumSizeSubarraySum(arr);
		System.out.println(ans);

	}

	private static int minimumSizeSubarraySum(int[] arr) {
		int minmumWindow = Integer.MAX_VALUE;
		int target = 7;
		int left = 0;
		int sum = 0;

		for (int right = 0; right < arr.length; right++) {
			sum = sum + arr[right];

			while (sum >= target) {
				minmumWindow = Math.min(minmumWindow, right - left + 1);
				// remove element from left
				sum = sum - arr[left];
				left++;

			}
		}

		if (minmumWindow == Integer.MAX_VALUE)
			System.out.println(0);
		else
			System.out.println(minmumWindow);
		
		return minmumWindow;
	}


	private static int minimumSubarraySum(int[] arr) {
		int target = 7;
		int minmumWindow = Integer.MAX_VALUE;

		for (int left = 0; left < arr.length; left++) {
			int sum = 0;
			for (int right = left; right < arr.length; right++) {
				sum = sum + arr[right];
				if (sum >= target) {
					minmumWindow = Math.min(minmumWindow, right - left + 1);
					break;
				}

			}
		}
//		System.out.println(minmumWindow == Integer.MAX_VALUE ? 0 : minmumWindow);
		return minmumWindow;
	}
}