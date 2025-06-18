package trycatchblock;

public class BankAccount {
	private double balance = 1000;
	public void deposit(double amount) {
		try {
			if (amount<=0) {
				throw new IllegalArgumentException("Deposit amount must be greater than"+"zero");
			}
			balance+=amount;
			System.out.println("Successfully deposited!!"+amount);
			System.out.println(balance);
		}
		catch(IllegalArgumentException ex) {
			System.out.println("Error: "+ ex.getMessage());
		}
	}

	public static void main(String[] args) {
		BankAccount account=new BankAccount();
		account.deposit(15000);

	}

}
