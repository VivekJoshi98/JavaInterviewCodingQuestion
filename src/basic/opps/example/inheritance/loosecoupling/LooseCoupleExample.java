package basic.opps.example.inheritance.loosecoupling;

public class LooseCoupleExample {
	public static void main(String[] args) {
		Car c=new Car(new DieselEngine()); // Car c=new Car(new PetrolEngine());
		c.move();
	}
}
