package basic.access.specifier;



import basic.program.*;

public class AccessSubclass extends SubClasses{

	
	public static void main(String[] args) {
		AccessSubclass as=new AccessSubclass();
		System.out.println(as.a);//public 
		System.out.println(as.b);//protected
//		System.out.println(as.c);//default
//		System.out.println(as.d);//private
		
		as.display();
		
	}
}
