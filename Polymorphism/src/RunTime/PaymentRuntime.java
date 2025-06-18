package RunTime;

public class PaymentRuntime {
	void pay() {
		System.out.println("Generic payment processed");
	}
}
class CreditCardPayment extends PaymentRuntime{
	void pay() {
		System.out.println("payment done via credit card");
	}
}
class UPIPayment extends PaymentRuntime{
	void pay() {
		System.out.println("payment done via upi");
	}
	public static void main(String[] args) {
		PaymentRuntime payment;
		payment = new CreditCardPayment();
		payment.pay();
		payment = new UPIPayment();
		payment.pay();

	}

}
