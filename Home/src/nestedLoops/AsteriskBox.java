package nestedLoops;
import java.util.Scanner;
public class AsteriskBox {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        // Ask user for box size
	        System.out.print("Enter box size: ");
	        int n = sc.nextInt();

	        // Loop through rows
	        for (int i = 1; i <= n; i++) {
	            // Loop through columns
	            for (int j = 1; j <= n; j++) {
	                // Print '*' only at borders, otherwise space
	                if (i == 1 || i == n || j == 1 || j == n) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println(); // New line after each row
	        }

	        sc.close();
	    }
	}
             
	
