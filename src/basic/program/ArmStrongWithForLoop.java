package basic.program;

public class ArmStrongWithForLoop {
	
	
	public static void main(String[] args) {
        for (int n = 100; n <= 999; n++) {
  
					isArmstrong(n);
        }
    }

    public static void isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int r; 
        
        while (number > 0) {
            r = number % 10;
            sum = sum + r * r * r;
            number = number / 10;
        }
     
        if(originalNumber == sum)
		{
			System.out.println(originalNumber+" No is ArmStrong ");
		}
		else
		{
			System.out.println(originalNumber+" No is not ArmStrong ");
		}
     }
     

}
