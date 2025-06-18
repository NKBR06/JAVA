package vehiclemanagement;

import java.util.Scanner;

class Vehicle {
    protected String make;
    protected String model;
    protected int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    private String trunkCapacity;

    public Car(String make, String model, int year, String trunkCapacity) {
        super(make, model, year);
        this.trunkCapacity = trunkCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("[Car]");
        super.displayInfo();
        System.out.println("Trunk Capacity: " + trunkCapacity);
    }
}

class Truck extends Vehicle {
    private String loadCapacity;

    public Truck(String make, String model, int year, String loadCapacity) {
        super(make, model, year);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("[Truck]");
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity);
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Vehicle Type (Car/Truck): ");
        String type = sc.nextLine();

        System.out.print("Make: ");
        String make = sc.nextLine();

        System.out.print("Model: ");
        String model = sc.nextLine();

        System.out.print("Year: ");
        int year = sc.nextInt();
        sc.nextLine(); // Consume newline

        if (type.equalsIgnoreCase("Car")) {
            System.out.print("Trunk Capacity: ");
            String trunkCapacity = sc.nextLine();
            Car car = new Car(make, model, year, trunkCapacity);
            car.displayInfo();
        } else if (type.equalsIgnoreCase("Truck")) {
            System.out.print("Load Capacity: ");
            String loadCapacity = sc.nextLine();
            Truck truck = new Truck(make, model, year, loadCapacity);
            truck.displayInfo();
        } else {
            System.out.println("Invalid Vehicle Type.");
        }

        sc.close();
    }
}
