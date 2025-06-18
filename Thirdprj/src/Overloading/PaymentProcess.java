package Overloading;

public class PaymentProcess {

	public void makePayment(String cardnumber, String cvv, String expirydate) {
		System.out.println("Paid by Cerditcard"+cardnumber);
	}
	
	public void makePayment(String upi) {
		System.out.println("Paid by upi"+upi);
	}
	
	public void makePayment(String wallet, int amount) {
		System.out.println("Paid by walletid"+wallet+"Amount:"+amount);
	}
	public static void main(String[] args) {
		PaymentProcess obj = new PaymentProcess();
		obj.makePayment("657","","");
		obj.makePayment("65789i");
		obj.makePayment("657",897);
		
	}
}


