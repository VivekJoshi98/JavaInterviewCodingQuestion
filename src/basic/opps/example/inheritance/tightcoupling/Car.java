package basic.opps.example.inheritance.tightcoupling;

public class Car {
	PetrolEngine e;
	Car()
	{
		e=new PetrolEngine();
	}

	void move() {
		System.out.println("Car move with: ");
		e.show();
	}
}
