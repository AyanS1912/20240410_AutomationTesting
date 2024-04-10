package Pillars;

class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    void honk() {
        System.out.println("Car is honking");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.move(); // Inherits move() method from Vehicle class
        car.honk(); // Specific to Car class
    }
}
