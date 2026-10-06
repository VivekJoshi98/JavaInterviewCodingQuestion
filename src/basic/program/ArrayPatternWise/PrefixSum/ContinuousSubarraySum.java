package basic.program.ArrayPatternWise.PrefixSum;

import java.util.HashMap;

public class ContinuousSubarraySum {

	public static void main(String[] args) {
		int[] arr = { 23, 1, 4, 6, 7 };
		int k = 6;

		boolean solution = solution(arr, k);
		System.out.println(solution);
		boolean optimizedSolution = optimizedSolution(arr, k);
		System.out.println(optimizedSolution);

	}

	private static boolean optimizedSolution(int[] arr, int k) {
		
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		int prefixSum=0;
		for (int i = 0; i < arr.length; i++) {
			
			prefixSum+=arr[i];
			int rem=prefixSum%k;
			
			if(rem==0 && i>=1)
			{
				return true;
			}
			else if(map.containsKey(rem)){
				int idx=map.get(rem);
				if(i-idx>=2)
				{
					return true;
				}
			}
			else {
				map.put(rem, i);
			}
		}
		return false;
		
	}

	private static boolean solution(int[] arr, int k) {
		for (int i = 0; i < arr.length-1; i++) {
				int sum	=arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				sum+=arr[j];
				if (sum%k==0) {
					return true;
				}

			}
		}
		return false;
	}
}
