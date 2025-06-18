package BankLoan;
import java.util.Scanner;
public class TableMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=1;i<=10;i++) {
        	int result =n*i;
        
        System.out.println(n+ "*" +i+ "=" +result);
        }
        sc.close();
	}

}
