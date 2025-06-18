package payrollsystem;

import java.util.Scanner;

abstract class Employee {
    protected String name;
    protected int id;
    protected double basicSalary;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculateSalary();
    public abstract String getType();

    public void printSalaryDetails() {
        System.out.println("Employee: " + name + " (ID: " + id + ")");
        System.out.println("Type: " + getType());
        System.out.println("Total Salary: ₹" + (int) calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    private double benefits;

    public FullTimeEmployee(String name, int id, double basicSalary, double benefits) {
        super(name, id);
        this.basicSalary = basicSalary;
        this.benefits = benefits;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + benefits;
    }

    @Override
    public String getType() {
        return "Full-time";
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String getType() {
        return "Part-time";
    }
}

public class EmployeePayrollSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Employee Type (FullTimeEmployee/PartTimeEmployee): ");
        String type = sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("ID: ");
        int id = sc.nextInt();

        Employee employee;

        if (type.equalsIgnoreCase("FullTimeEmployee")) {
            System.out.print("Basic Salary: ");
            double basic = sc.nextDouble();

            System.out.print("Benefits: ");
            double benefits = sc.nextDouble();

            employee = new FullTimeEmployee(name, id, basic, benefits);

        } else if (type.equalsIgnoreCase("PartTimeEmployee")) {
            System.out.print("Hourly Rate: ");
            double rate = sc.nextDouble();

            System.out.print("Hours Worked: ");
            int hours = sc.nextInt();

            employee = new PartTimeEmployee(name, id, rate, hours);

        } else {
            System.out.println("Invalid Employee Type.");
            sc.close();
            return;
        }

        System.out.println();
        employee.printSalaryDetails();
        sc.close();
    }
}
