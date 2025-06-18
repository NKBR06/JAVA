package schoolSystem;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = 7;
        int guess;

        // Repeat until the user guesses the correct number
        do {
            System.out.print("Guess the secret number: ");
            guess = scanner.nextInt();

            if (guess != secretNumber) {
                System.out.println("Wrong guess, try again!");
            }
        } while (guess != secretNumber);

        System.out.println("Congratulations! You guessed the correct number.");
        scanner.close();
    }
}
