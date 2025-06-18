package Inheritance;

// ----- Base Class -----
// This class represents the base for all types of employees
public class Employee {
    void work() {
        System.out.println("Employee works in an organization.");
    }

    // ----- Main Method -----
    public static void main(String[] args) {
        // ----- Single Inheritance -----
        System.out.println("Single Inheritance:");
        Manager manager = new Manager();
        manager.work();         // Inherited from Employee
        manager.manageTeam();   // Specific to Manager

        // ----- Multilevel Inheritance -----
        System.out.println("\nMultilevel Inheritance:");
        SeniorManager senior = new SeniorManager();
        senior.work();          // From Employee
        senior.manageTeam();    // From Manager
        senior.planStrategy();  // Specific to SeniorManager

        // ----- Hierarchical Inheritance -----
        System.out.println("\nHierarchical Inheritance:");
        Developer dev = new Developer();
        dev.work();             // From Employee
        dev.writeCode();        // Specific to Developer

        // ----- Hybrid Inheritance using Interface -----
        System.out.println("\nHybrid Inheritance:");
        TechLead lead = new TechLead();
        lead.work();            // From Employee
        lead.guideTeam();       // From Leadership interface
    }
}

// ----- Single Inheritance -----
// Manager inherits from Employee
class Manager extends Employee {
    void manageTeam() {
        System.out.println("Manager manages the team.");
    }
}

// ----- Multilevel Inheritance -----
// SeniorManager inherits from Manager, which inherits from Employee
class SeniorManager extends Manager {
    void planStrategy() {
        System.out.println("Senior Manager plans company strategy.");
    }
}

// ----- Hierarchical Inheritance -----
// Developer also inherits directly from Employee (parallel to Manager)
class Developer extends Employee {
    void writeCode() {
        System.out.println("Developer writes code.");
    }
}

// ----- Hybrid Inheritance using Interface -----
// Leadership is an interface, used with class inheritance
interface Leadership {
    void guideTeam();
}

// TechLead inherits from Employee and implements Leadership
class TechLead extends Employee implements Leadership {
    public void guideTeam() {
        System.out.println("Tech Lead guides the technical team.");
    }
}

