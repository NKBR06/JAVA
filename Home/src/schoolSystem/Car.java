package schoolSystem;

// Parent class: Vehicle
class Vehicle {
    int speed = 60; // Vehicle speed variable

    void displaySpeed() {
        System.out.println("Speed of Vehicle: " + speed + " km/h");
    }
}

// Child class: Car extends Vehicle
public class Car extends Vehicle {
    int speed = 100; // Car's own speed variable

    // Overriding the displaySpeed method
    @Override
    void displaySpeed() {
        System.out.println("Speed of Car: " + speed + " km/h");        // Child speed
        System.out.println("Speed of Vehicle: " + super.speed + " km/h"); // Parent speed using super
    }

    // Main method
    public static void main(String[] args) {
        Car car = new Car();  // Create Car object
        car.displaySpeed();   // Call overridden method
    }
}

