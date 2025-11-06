package co2_scena;

//Base class
class Vehicle {
 void move() {
     System.out.println("The vehicle is moving.");
 }
}

//Derived class
class Car extends Vehicle {
 void fuelType() {
     System.out.println("This car uses petrol or diesel.");
 }
}

//Main class
public class VehicleSystem {
 public static void main(String[] args) {
     Car car = new Car();
     car.move();      // Inherited from Vehicle
     car.fuelType();  // Car-specific method
 }
}
