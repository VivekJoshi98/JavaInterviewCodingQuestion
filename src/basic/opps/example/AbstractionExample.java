package basic.opps.example;

	
	public class AbstractionExample {
		 public static void main(String[] args) {
		     Vehicle car = new Car("Toyota");
		     Vehicle bike = new Motorcycle("Harley Davidson");

		     car.start(); // Output: Toyota starts with a key.
		     car.stop();  // Output: Toyota stops with brakes.

		     bike.start(); // Output: Harley Davidson starts with a kick-start.
		     bike.stop();  // Output: Harley Davidson stops with brakes.
		 }
}

