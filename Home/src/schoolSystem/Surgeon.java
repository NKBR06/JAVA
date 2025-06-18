package schoolSystem;

// Base class: Doctor
class Doctor {
    // Method representing general duty
    void duty() {
        System.out.println("General medical duties");
    }
}

// Subclass: Surgeon
public class Surgeon extends Doctor {
    // Overriding the duty method
    @Override
    void duty() {
        super.duty(); // Call to parent class method
        System.out.println("Performing surgeries");
    }

    // Main method
    public static void main(String[] args) {
        // Creating object of Surgeon
        Surgeon surgeon = new Surgeon();
        surgeon.duty(); // Calls overridden method
    }
}

