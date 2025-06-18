package schoolSystem;

// Base class: Bank
class Bank {
    // Constructor that prints the bank name
    Bank(String bankName) {
        System.out.println("Bank Name: " + bankName);
    }
}

// Derived class: Branch
public class Branch extends Bank {
    
    // Constructor for Branch
    Branch(String bankName, String branchName) {
        super(bankName); // Call parent constructor
        System.out.println("Branch Name: " + branchName);
    }

    // Main method
    public static void main(String[] args) {
        // Create a Branch object which triggers both constructors
        Branch branch = new Branch("ABC Bank", "Mumbai Branch");
    }
}
