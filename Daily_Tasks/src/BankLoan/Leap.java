package BankLoan;
import java.util.Scanner;
public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int leap = sc.nextInt();
        
        if(leap%4==0) {
        	if(leap%100==0) {
        		if(leap%400==0) {
        			System.out.println("It's a leap year");
        		}
        		else {
        			System.out.println("its not a leap year");
        		}
        	}
        	else {
        		System.out.println("its a leap year");
        	}
        	
        }
        else {
        	System.out.println("its not a leap year");
        }
        sc.close();
	}

}
