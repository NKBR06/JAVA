package schoolSystem;

import java.util.Scanner;

public class CountdownTimer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a starting number
        System.out.print("Enter a number to start countdown: ");
        int number = scanner.nextInt();

        // Countdown loop
        while (number >= 0) {
            System.out.print(number);
            if (number != 0) {
                System.out.print(", ");
            }
            number--;
        }

        scanner.close();
    }
}

