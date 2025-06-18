package BankLoan;
import java.util.Scanner;
public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int marks = sc.nextInt();
        
        if(marks>=90) {
        	System.out.println("EXCELLENT");
        }
        if(marks>=70 && marks<=89){
        	if(marks>=80) {
        		System.out.println("Very Good");
        	}
        	else {
        		System.out.println("Good");
        	}
        }
        if(marks<70) {
        	System.out.println("Needs Improvement");
        }
        	
    
        sc.close();
	}

}
