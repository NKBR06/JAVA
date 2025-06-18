package decisionMaking;
import java.util.Scanner;
public class HospitalTriage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();  // Consume newline

        System.out.print("Has severe symptoms? (yes/no): ");
        String severe = sc.nextLine().toLowerCase();

        // Priority logic
        if (severe.equals("yes")) {
            if (age > 60) {
                System.out.println("High Priority patient.");
            } else {
                System.out.println("Medium Priority patient.");
            }
        } else {
            System.out.println("Low Priority patient.");
        }

        sc.close();
    }
}
	
