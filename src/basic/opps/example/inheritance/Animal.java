package basic.opps.example.inheritance;

class Dog {
	 	 static void eat() {
		System.out.println("Dog is Eating");
	}  
}

public class Animal extends Dog{
	
	static void eat() {
	//	super.eat();
		System.out.println("Animal is Eating");
	}
	public static void main(String[] args) {
		Animal a=new Animal();
		a.eat();
	}
} 	 