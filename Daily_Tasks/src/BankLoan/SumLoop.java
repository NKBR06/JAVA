package BankLoan;
import java.util.Scanner;
public class SumLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int sum=0;
        for(; num!=0;num=num/10) {
        	int digit = num%10;
        	sum=sum+digit;
        }
        System.out.println(sum);
        sc.close();
	}

}
