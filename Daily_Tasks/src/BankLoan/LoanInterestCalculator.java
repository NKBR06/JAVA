package BankLoan;
import java.util.Scanner;
public class LoanInterestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double principle = sc.nextDouble();
		double time = sc.nextDouble();
		double rate = sc.nextDouble();
		
		double simpleInterest = principle*time*rate/100;
		
		System.out.println("the simple interest:"+simpleInterest);
		
		sc.close();
	}

}
