package transportation;  // Package name

public class TransportationSystem {  // Class name

    // Base class Vehicle
    public static class Vehicle {
        public void move() {
            System.out.println("The vehicle moves.");
        }
    }

    // Car subclass that overrides move()
    public static class Car extends Vehicle {
        @Override
        public void move() {
            System.out.println("The car drives on roads.");
        }
    }

    // Boat subclass that overrides move()
    public static class Boat extends Vehicle {
        @Override
        public void move() {
            System.out.println("The boat sails on water.");
        }
    }

    public static void main(String[] args) {
        // Create references of type Vehicle for both Car and Boat
        Vehicle myCar = new Car();
        Vehicle myBoat = new Boat();

        // Call move() method on both objects
        myCar.move();   // Expected output: "The car drives on roads."
        myBoat.move();  // Expected output: "The boat sails on water."
    }
}
