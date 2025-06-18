package BankLoan;
import java.util.Scanner;
public class GradeEvaluator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int marks = sc.nextInt();
        
        if(marks>=40) {
        	System.out.println("PASS,CONGRATS!!!");
        }
        else {
        	System.out.println("FAIL,BETTER LUCK NEXT TIME");
        }
        sc.close();
        }

}
