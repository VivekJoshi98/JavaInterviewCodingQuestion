package basic.exception;

public class ExceptionTest
{
	public static void main(String[]s)
	{
		try{
	 	 int a=10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	
		System.out.println("***********************");
	}
}

