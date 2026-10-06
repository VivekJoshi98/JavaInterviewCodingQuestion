package basic.program.ArrayPatternWise.Kadanes;

public class MaximumSubarray {
	public static void main(String[] args) {
		
		int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
		
		int bruteForce = bruteForce(arr);
		System.out.println(bruteForce);
		
		int optimized=optimized(arr);
		System.out.println(optimized);
	}

	private static int optimized(int[] arr) {
		
		int maxSum=arr[0];
		int sum=0;
		
		for(int num:arr)
		{
			sum+=num;
			maxSum=Math.max(maxSum, sum);
			
			if(sum<0)
			{
				sum=0;
			}
		}
		
		return maxSum;
	}

	private static int bruteForce(int[] arr) {
		
		int maxSum=arr[0];
		for (int i = 0; i < arr.length; i++) {
			int sum=0;
			for (int j = i; j < arr.length; j++) {
				sum+=arr[j];
				maxSum=Math.max(maxSum, sum);
			}
		}
		return maxSum;
	}
	
}
