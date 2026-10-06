package basic.program.ArrayPatternWise.PrefixSum;

import java.util.HashMap;

public class SabarraySumEqualsK {

	public static void main(String[] args) {
	
		int[] arr= {1,-1,0,1,2,-1,3};
		int k=3;
		
		subarraySum(arr,k);
		int subarraySumOptimize = subarraySumOptimize(arr,k);	
		System.out.println(subarraySumOptimize);
	}

	private static int subarraySumOptimize(int[] arr, int k) {
		
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		int count=0;
		
		int sum=0;
		map.put(0, 1);
		
		for (int i = 0; i < arr.length; i++) {
			
			sum=sum+arr[i];
			int diff = sum-k;
			if(map.containsKey(diff))
			{
				count=count+map.get(diff);
			}
			
			map.put(sum, map.getOrDefault(sum, 0)+1);                                                                                                                 
		}
		return count;	
	
	}

	private static void subarraySum(int[] arr, int k) { // Brute force
		
		int count=0;
		for (int l = 0; l < arr.length; l++) {
			int sum=0;
			for (int r = l; r < arr.length; r++) {
				sum+=arr[r];
				if(sum==k)
				{
					count++;
				}
			}   
		}
		System.out.println(count);            
	}
}
