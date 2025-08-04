package tasks;

class Vehicle {
    public void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    public void fuelType() {
        System.out.println("Fuel type: Petrol");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        car.fuelType();
    }
}