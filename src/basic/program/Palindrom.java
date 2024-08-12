package basic.program;

import java.util.Scanner;

public class Palindrom {

	 void palindromWithoutLogic() {
		

		System.out.println("Enter a number ::: ");
		Scanner sc=new Scanner(System.in);
		int no= sc.nextInt();
		String str=Integer.toString(no);
		StringBuilder builder=new StringBuilder(str);
		String string = builder.reverse().toString();
		
	//	System.out.println(string); 
		if(string.equals(str))
		{
			System.out.println("No is palindrom");
		}
		else
		{
			System.out.println("No is not palindrom");
		}

	}
	 
	 
	  void palindromWithLogic() {
		
		  int sum=0,r,input,orignalValue;
		  System.out.println("Enter a Number ::: ");
		  Scanner sc=new Scanner(System.in);
		  input =sc.nextInt();
		  orignalValue=input;
		  
		  while(input>0)
		  {
			  r=input%10;
			  sum=(sum*10)+r;
			  input=input/10;
		  }
		  
		  if(orignalValue==sum)
		  {
			  System.out.println("No is Palindrom");
		  }
		  else
		  {
			  System.out.println("No is not Palindrom");
		  }	  

	}
	  
	  void StringPalindrom()
	  {
		  String x="vivekkeviv";//saippuakivikauppias
//		  int p=7449447;
//		  String x=Integer.toString(p);
		  int i=0,j=x.length()-1;
		  
		  while(i<j)
		  {
			  if(x.charAt(i)!= x.charAt(j))
			  {
				  System.out.println("String is not palindrom");
				  System.exit(0);
			  }
			  i++;
			  j--;
		  }
		  System.out.println("String is palindrom");
	  }
	  
	public static void main(String[]s)
	{
		Palindrom p=new Palindrom();
//		p.palindromWithoutLogic();
//		p.palindromWithLogic();
		p.StringPalindrom();
	}
}
