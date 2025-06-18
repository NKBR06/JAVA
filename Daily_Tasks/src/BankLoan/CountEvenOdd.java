package BankLoan;
import java.util.Scanner;
public class CountEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int start = sc.nextInt();
        int end = sc.nextInt();
        
        int evencount=0;
        int oddcount=0;
        
        for(int i=start;i<=end;i++) {
        	if(i%2==0) {
        		evencount++;
        	}
        	else {
        		oddcount++;
        	}
        }
        	System.out.println("even"+evencount);
        	System.out.println("odd"+oddcount);

        sc.close();
        }

}
