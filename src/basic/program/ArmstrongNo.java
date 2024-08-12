package basic.program;

/*
 * An Armstrong number in Java is a number that is equal to
   the sum of its own digits raised to the power of the number
   of digits it has. For example, an Armstrong number of 3 
   digits would be a number where the sum of each digit raised
    to the power of 3 equals the original number itself.*/
public class ArmstrongNo {

	public static void main(String[] args) {
		// 153= 1*1*1 + 5*5*5 + 3*3*3
		int n = 371, sum = 0, orignalValue, rem;
		orignalValue = n;

		while (n > 0) {
			rem = n % 10;
			sum = sum + rem * rem * rem;
			n = n / 10;
		}
		if (sum == orignalValue) {
			System.out.println("No is Armstrong");
		} else {
			System.out.println("No is not Armstrong");
		}

	}

}
