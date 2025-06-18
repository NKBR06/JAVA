package schoolSystem;

import java.util.Scanner;

public class SumUntilNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        // Keep asking until a negative number is entered
        while (true) {
            System.out.print("Enter a positive number (negative to stop): ");
            number = scanner.nextInt();

            if (number < 0) {
                break; // Exit loop if number is negative
            }

            sum += number; // Add to sum if number is positive
        }

        System.out.println("Total sum of positive numbers: " + sum);
        scanner.close();
    }
}

