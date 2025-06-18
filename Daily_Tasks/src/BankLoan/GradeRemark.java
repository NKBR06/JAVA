package BankLoan;

import java.util.Scanner;

public class GradeRemark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        String day = sc.next();
        
        switch(day) {
        case "A":System.out.println("Excellent");
                 break;
        case "B":System.out.println("Very Good");
                 break;
        case "C":System.out.println("Good");
                 break;
        case "D":System.out.println("Needs improvement");
                 break;
        case "F":System.out.println("Fail");
                 break;
        default:System.out.println("Invalid Input");
        }
        sc.close();
	}

}
