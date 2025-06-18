package methodOverloading;

import java.util.Scanner;

public class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two decimal numbers
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        // Add two integers
        System.out.print("Enter two integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Sum (int + int): " + calc.add(a, b));

        // Add two decimal numbers
        System.out.print("Enter two decimal numbers: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        System.out.println("Sum (double + double): " + calc.add(x, y));

        // Add three integers
        System.out.print("Enter three integers: ");
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        int r = scanner.nextInt();
        System.out.println("Sum (int + int + int): " + calc.add(p, q, r));

        scanner.close();
    }
}
