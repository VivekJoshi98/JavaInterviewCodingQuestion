package basic.program.Array;

import java.util.Arrays;

public class ArrayUpdation {

		public static void main(String[] args) {
			int[] arr= {10,20,30,40,50,60};
			
			int indexpos=2;
			int element=100;
			arr[indexpos]=element;
			
			System.out.println(Arrays.toString(arr));
	}
}
 