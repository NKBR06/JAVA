package BankLoan;

import java.util.Scanner;

public class ReverseDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int reversed = 0;
        
        while(n!=0) {
        	int digit = n%10;
        	reversed = reversed*10+digit;
        	n=n/10;
        	}
        System.out.println(reversed);
        sc.close();
        }

}
