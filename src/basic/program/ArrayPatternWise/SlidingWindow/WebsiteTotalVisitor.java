package basic.program.ArrayPatternWise.SlidingWindow;

public class WebsiteTotalVisitor {
	
	public static void main(String[] args) {
		
		int[] users= {100,48,82,57,34,112,65};
		int days=3;
		int windowSum=0,average=0;
		
		for (int i = 0; i < days; i++) {
			
			windowSum=windowSum+users[i];
		}
		average=windowSum/days;
		
		System.out.println("Total no of users visited (average) : "+average);
		
		for (int i = 1; i <=users.length-days; i++) {
			
			windowSum=windowSum-users[i-1]+users[i+days-1];
			
			average=windowSum/days; // cal avg 
			System.out.println("Total number of user visited (average):"+average);
		}
		
	}
}
	