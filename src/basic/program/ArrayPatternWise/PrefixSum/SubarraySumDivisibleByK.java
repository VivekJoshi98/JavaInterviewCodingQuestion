package basic.program.ArrayPatternWise.PrefixSum;

import java.util.HashMap;

public class SubarraySumDivisibleByK {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 0, -2, -3, 1 };
		int k = 5;
		bruteForceSolution(arr, k);
		int optimizedSolution = optimizedSolution(arr,k);
		System.out.println(optimizedSolution);
	}

	private static int optimizedSolution(int[] arr, int k) {
		
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		map.put(0, 1);
		int count=0;
		int prefixSum=0;
		for (int i = 0; i < arr.length; i++) {
			prefixSum+=arr[i];
			int rem=prefixSum%k;
			if(map.containsKey(rem))
			{
				count+=map.get(rem);
			}
			
			map.put(rem,map.getOrDefault(rem,0)+1);
			
			
		}
		return count;
		
	}

	private static void bruteForceSolution(int[] arr, int k) {

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum = sum + arr[j];
				if (sum % k == 0) {
					count++;
				}
			}
		}
		System.out.println(count);

	}
}
