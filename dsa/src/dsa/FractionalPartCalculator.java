package dsa;
import java.util.Scanner;

public class FractionalPartCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input number
        System.out.print("Enter a floating-point number: ");
        double number = scanner.nextDouble();

        // Step 2: Extract integer part
        int integerPart = (int) number;

        // Step 3: Calculate fractional part
        double fractionalPart = number - integerPart;

        // Step 4: Display results
        System.out.println("Integer Part: " + integerPart);
        System.out.println("Fractional Part: " + fractionalPart);
        scanner.close();
    }
}
//Pseudo
//Start
//Input number
//integerPart = floor(number)
//fractionalPart = number - integerPart
//Print integerPart
//Print fractionalPart
//End
