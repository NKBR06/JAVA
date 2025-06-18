package BankLoan;
import java.util.Scanner;
public class UniqueDivisorCounter {
	public static int countDivisor(int n) {
		int Count = 0;
		
		for(int i=1;i*i<=n;i++) {
			if(n%i==0) {
				if(i==n/i) {
					Count+=1;
				}
				else {
					Count+=2;
				}
			}
		}
		return Count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = countDivisor(n);
        System.out.println(result);
        sc.close();
	}
	

}
