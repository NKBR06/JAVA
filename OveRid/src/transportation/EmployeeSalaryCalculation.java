package transportation; 

public class EmployeeSalaryCalculation {

    // Superclass Employee
    public static class Employee {
        // Method to calculate base salary
        public void calculateSalary() {
            System.out.println("Calculating base salary...");
        }
    }

    // FullTimeEmployee subclass that overrides calculateSalary()
    public static class FullTimeEmployee extends Employee {
        @Override
        public void calculateSalary() {
            System.out.println("Calculating full-time salary with benefits...");
        }
    }

    // PartTimeEmployee subclass that overrides calculateSalary()
    public static class PartTimeEmployee extends Employee {
        @Override
        public void calculateSalary() {
            System.out.println("Calculating part-time salary based on hours...");
        }
    }

    public static void main(String[] args) {
        // Create references of type Employee for FullTimeEmployee and PartTimeEmployee
        Employee fullTime = new FullTimeEmployee();
        Employee partTime = new PartTimeEmployee();

        // Call calculateSalary() method on both objects
        fullTime.calculateSalary();  // Expected output: "Calculating full-time salary with benefits..."
        partTime.calculateSalary();  // Expected output: "Calculating part-time salary based on hours..."
    }
}

