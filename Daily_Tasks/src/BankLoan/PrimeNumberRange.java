package BankLoan;
import java.util.Scanner;
public class PrimeNumberRange {
	 public static boolean isPrime(int n) {
	        if (n < 2) return false;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		for(int i=start;i<=end;i++) {
			if(isPrime(i)) {
			System.out.println(i);
			}
		}
       sc.close();
	}

}
