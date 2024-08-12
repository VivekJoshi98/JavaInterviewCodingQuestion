 package basic.program.Array;

import java.util.Arrays;

public class ReverseLastElementOfArray {

	public static void main(String[] s) {

		String[] reverse = { "Santosh", "sonu", "monu", "vivek" };

		// String lastElement=reverse[3];
		String lastElement = reverse[reverse.length - 1]; 

		StringBuilder sb = new StringBuilder(lastElement);
//	reverse[reverse.length-1];
		String string = sb.reverse().toString();
		reverse[reverse.length - 1] = string;
	//	String str = sb.reverse().toString();

		System.out.println("Reverse last element :: " + reverse[reverse.length - 1]);
		System.out.println("Reverse last index :: " + string);

//	System.out.println("String :: " +string);
		for (String rev : reverse) {
			System.out.println(rev);
		}
		System.out.println(" ^ " + Arrays.toString(reverse));

	}

}
