package ComplieTime;

public class PaymentProcessor {
	//method 1: pay by amount only
	void makePayment(double amount) {
		System.out.println("paid "+amount);
	}
	
	void makePayment(double amount, String currency) {
		System.out.println("paid "+currency+amount);
	}
	
	void makePayment(double amount,double discount) {
		double finalamount=amount-discount;
		System.out.println("paid $"+finalamount+"after discount");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentProcessor process = new PaymentProcessor();
		process.makePayment(1000);
		process.makePayment(200.2,"$");
		process.makePayment(500,50);

	}

}
