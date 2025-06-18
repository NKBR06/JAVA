package nestedLoops;
import java.util.Scanner;
public class MultiplicationGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Ask user for the size of the multiplication table
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for columns
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println(); // Move to the next line after each row
        }

        sc.close();
    }
}
	
