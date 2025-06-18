package decisionMaking;
import java.util.Scanner;
public class LoanApproval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Input: Employment status
        System.out.print("Are you employed? (yes/no): ");
        String employed = sc.nextLine().toLowerCase();

        // Logic based on employment status
        if (employed.equals("yes")) {
            System.out.print("Enter credit score: ");
            int score = sc.nextInt();

            // Nested condition for credit score
            if (score > 750) {
                System.out.println("Loan Approved.");
            } else if (score >= 600) {
                System.out.println("Further review.");
            } else {
                System.out.println("Loan Denied due to low credit score.");
            }

        } else {
            System.out.println("Loan Denied.");
        }

        sc.close();
    }
}
	
