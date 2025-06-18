package BankLoan;
import java.util.Scanner;
public class SignTypeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        if(num>0) {
        	if(num%2==0) {
        	System.out.println("Positive Even");
        }
        else {
        	System.out.println("Positive odd");
        }
        }
        if(num<0) {
        	if(num%2==0) {
        	System.out.println("Negative even");
        }
        else {
        	System.out.println("Negative odd");
        }
        }
        sc.close();
	}

}
