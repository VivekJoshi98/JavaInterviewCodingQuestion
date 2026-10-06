package basic.program.ArrayPatternWise.SlidingWindow;

import java.util.HashMap;

public class FruitsInBasket {

	public static void main(String[] args) {
		int[] fruits = { 2, 2,3,3,4,4,4};
//		int fruitInBasket = fruitInBasket(fruits);
//		System.out.println(fruitInBasket);
		
		int fruitIntoBasket = fruitIntoBasket(fruits);
		System.out.println(fruitIntoBasket);
	}
	
	private static int fruitIntoBasket(int[] fruits) {
		
		int maxFruits = Integer.MIN_VALUE;
		int left=0;
		HashMap<Integer, Integer> basket = new HashMap<Integer, Integer>();
		for (int right = 0; right < fruits.length; right++) {
			basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);
			
			while (basket.size() > 2) {
				
				basket.put(fruits[left], basket.get(fruits[left]) - 1);
				
				if(basket.get(fruits[left])==0)
				{
					basket.remove(fruits[left]);
				}
				left++;
			}
			maxFruits = Math.max(maxFruits, right - left + 1);
		}
		
		return maxFruits;
	}

	private static int fruitInBasket(int[] fruits) { // BruteForce Approach

		int maxFruits = Integer.MIN_VALUE;
		for (int left = 0; left < fruits.length; left++) {

			HashMap<Integer, Integer> basket = new HashMap<Integer, Integer>();

			int currentCount = 0;

			for (int right = left; right < fruits.length; right++) {

//				basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);
				int orDefault = basket.getOrDefault(fruits[right], 0);
				basket.put(fruits[right], orDefault +1);
				if (basket.size() > 2) {
					break;
				}

				currentCount++;

				maxFruits = Math.max(maxFruits, currentCount);
			}
		}
		return maxFruits;
		
	}
	
	
}