package BankLoan;
import java.util.Scanner;
public class ProgramGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int FirstPlayer = sc.nextInt();
        int SecondPlayer = sc.nextInt();
        int ThirdPlayer = sc.nextInt();
        
        if(FirstPlayer>SecondPlayer) {
        	System.out.println("FirstPlayer is the highest 86"+FirstPlayer);
        }
        else if(SecondPlayer>ThirdPlayer){
        	System.out.println("SecondPlayer is the highest "+SecondPlayer);
        	
        }
        else {
        	System.out.println("third player is the highest "+ThirdPlayer);
        }
        sc.close();
	}

}
