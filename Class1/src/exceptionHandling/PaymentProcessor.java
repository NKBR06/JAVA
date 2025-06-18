package exceptionHandling;

public class PaymentProcessor {
	public void processPayment(double amount) throws IllegalArgumentException{
		try {
			if(amount<=0) {
				throw new IllegalArgumentException("Amount must be greater than zero");
			}
			//Simulating payment processing
			System.out.println("Processing payment of $"+amount);
		}catch(IllegalArgumentException ex) {
			System.out.println("Error:"+ex.getMessage());
			throw ex;
		}finally {
			System.out.println("payment attempt completed");
		}
	}
	public static void main(String[] args) {
		PaymentProcessor processor = new PaymentProcessor();
		try {
			processor.processPayment(-100);
		}catch (IllegalArgumentException ex) {
			System.out.println("Handled in main:"+ex.getMessage());
		}

	}

}
