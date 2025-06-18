package BankLoan;
import java.util.Scanner;
public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        double celsius = sc.nextDouble();
        double fahrenheit = 1.8*celsius+32;
        
        System.out.println(fahrenheit);
        }

}
