package decisionMaking;
import java.util.Scanner;
public class ScholarshipEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        System.out.print("Enter family income: ");
        int income = sc.nextInt();

        // Checking eligibility using nested if-else
        if (marks > 85) {
            if (income < 500000) {
                System.out.println("Full Scholarship granted.");
            } else {
                System.out.println("No scholarship granted.");
            }
        } else if (marks >= 70 && marks <= 85) {
            if (income < 300000) {
                System.out.println("Half Scholarship granted.");
            } else {
                System.out.println("No scholarship granted.");
            }
        } else {
            System.out.println("No scholarship granted.");
        }

        sc.close();
    }
}
	


