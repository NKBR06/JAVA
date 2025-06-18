package BankLoan;
import java.util.Scanner;
public class Community {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Age ");
        Scanner sc = new Scanner(System.in);
        
        int age = sc.nextInt();
        
        if(age<13) {
        	System.out.println("Child");
        }
        else if(age>=13 && age<=19) {
        	System.out.println("Teen");
        }
        else {
        	System.out.println("older");
        }
        sc.close();
	}
	


}
