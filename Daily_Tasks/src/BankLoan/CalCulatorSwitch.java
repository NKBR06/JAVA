package BankLoan;

import java.util.*;

public class CalCulatorSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Enter the first num");
        float num1 = sc.nextFloat();
        
        System.out.printf("Enter the second num");
        float num2 = sc.nextFloat();
        
        System.out.printf("Enter the operator");
        String op = sc.next();
        
        switch(op) {
        case "+":System.out.println("Addition: "+(num1+num2));
                 break;
        case "-":System.out.println("Subtraction: "+(num1-num2));
                 break;
        case "*":System.out.println("Multiplication: "+(num1*num2));
                 break;
        case "/":System.out.println("Division: "+(num1/num2));
                 break;
        default:System.out.println("Invalid Input");
        }
        sc.close();
	}

}
