package basic.opps.example.inheritance.loosecoupling;

public class Car {
	Engine e;
	Car(Engine e)
	{
		this.e=e;
	}

	void move() {
		System.out.println("Car move with: ");
		e.show();
	}
}