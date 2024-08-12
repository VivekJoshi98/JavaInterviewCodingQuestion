package basic.opps.example;
//               Abstraction Example  
//Abstract class representing a Vehicle
abstract class Vehicle {
private String vehicleName;

public Vehicle(String vehicleName) {
   this.vehicleName = vehicleName;
}

// Abstract method to start the vehicle
public abstract void start();

// Abstract method to stop the vehicle
public abstract void stop();

public String getVehicleName() {
   return vehicleName;
}
}

//Concrete class Car extending Vehicle
class Car extends Vehicle {
public Car(String vehicleName) {
   super(vehicleName);
}

@Override
public void start() {
   System.out.println(getVehicleName() + " starts with a key.");
}

@Override
public void stop() {
   System.out.println(getVehicleName() + " stops with brakes.");
}
}

//Concrete class Motorcycle extending Vehicle
class Motorcycle extends Vehicle {
public Motorcycle(String vehicleName) {
   super(vehicleName);
}

@Override
public void start() {
   System.out.println(getVehicleName() + " starts with a kick-start.");
}

@Override
public void stop() {
   System.out.println(getVehicleName() + " stops with brakes.");
}
}


