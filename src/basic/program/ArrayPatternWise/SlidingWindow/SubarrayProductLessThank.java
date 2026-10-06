package basic.program.ArrayPatternWise.SlidingWindow;

public class SubarrayProductLessThank { // Subarray Product Less Than K

	public static void main(String[] args) {

		int[] arr = { 10, 5, 2, 6 };
		int k = 100;
//		int maxProduct=0;
		subarrayProduct(arr, k);

		subarrayProductOptimized(arr, k);
	}

//*********************************************************************************
	private static void subarrayProduct(int[] arr, int k) { // Brute force approach
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int product = 1;
			for (int j = i; j < arr.length; j++) {
				product *= arr[j];
				if (product < k) {
					count++;
				}

				else {
					break;
				}

			}
		}
		System.out.println(count);
	}

//*********************************************************************************
	private static void subarrayProductOptimized(int[] arr, int k) { // Optimized approach
		
		int count=0;       //{ 10, 5, 2, 600 };
		int left=0;
		int product=1;
		for (int right = 0; right < arr.length; right++) {
			
			product*=arr[right];
			
			while(product>=k)
			{
				product/=arr[left];
				left++;
			}
			count+=right-left+1;
		}
		System.out.println(count);
	}
}
