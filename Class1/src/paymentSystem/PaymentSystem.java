package paymentSystem;

import java.util.Scanner;

// Define interface with two methods
interface PaymentGateway {
    void processPayment(double amount);
    void generateReceipt();
}

// Implementing Credit Card payment logic
class CreditCardPayment implements PaymentGateway {
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of ₹" + amount + "...");
    }

    public void generateReceipt() {
        System.out.println("Receipt: Credit Card Payment Successful.");
    }
}

// Implementing UPI payment logic
class UPIPayment implements PaymentGateway {
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of ₹" + amount + "...");
    }

    public void generateReceipt() {
        System.out.println("Receipt: UPI Payment Successful.");
    }
}

// Main class to run the program
public class PaymentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get payment method from user
        System.out.print("Enter payment method (CreditCard/UPI): ");
        String method = sc.nextLine();

        // Get payment amount from user
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        PaymentGateway payment;

        // Choose implementation based on user input
        if (method.equalsIgnoreCase("CreditCard")) {
            payment = new CreditCardPayment();
        } else if (method.equalsIgnoreCase("UPI")) {
            payment = new UPIPayment();
        } else {
            System.out.println("Invalid payment method!");
            sc.close();
            return;
        }

        // Process payment and generate receipt
        payment.processPayment(amount);
        payment.generateReceipt();

        sc.close();
    }
}
