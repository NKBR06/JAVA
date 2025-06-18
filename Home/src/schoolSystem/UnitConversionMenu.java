package schoolSystem;

import java.util.Scanner;

public class UnitConversionMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu options
            System.out.println("\n--- Unit Conversion Menu ---");
            System.out.println("1. Convert Celsius to Fahrenheit");
            System.out.println("2. Convert Kilometers to Miles");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter temperature in Celsius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = (celsius * 9 / 5) + 32;
                    System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                    break;

                case 2:
                    System.out.print("Enter distance in Kilometers: ");
                    double kilometers = scanner.nextDouble();
                    double miles = kilometers * 0.621371;
                    System.out.println("Distance in Miles: " + miles);
                    break;

                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
