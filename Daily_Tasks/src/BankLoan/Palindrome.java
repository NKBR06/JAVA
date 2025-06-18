package BankLoan;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int og=n;
        int rev=0;
        
        while(n!=0) {
        	int digit = n%10;
        	rev=rev*10+digit;
        	n=n/10;
        }
        if(og==rev) {
        	System.out.println("Palindrome");
        }
        else {
        	System.out.println("Not a palindrome");
        }
        sc.close();
	}

}
