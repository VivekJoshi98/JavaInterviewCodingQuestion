package basic.program;

public class VowelConsonant {

	public static void vowelConsonant(String str)
	{
		int vCount=0,cCount=0;
		str = str.toLowerCase();
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u')
			{
				vCount++;
			}
			else  {      
				cCount++;
			}
		} 
		 System.out.println("Number of vowels: " + vCount);    
	        System.out.println("Number of consonants: " + cCount);    
	}
	public static void main(String[] args) {
		VowelConsonant.vowelConsonant("Mynameisvivekjoshi");
	}
}
