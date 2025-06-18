package schoolSystem;

// Base class: Person
class Person {
    // Constructor that takes name
    Person(String name) {
        System.out.println("Person Name: " + name);
    }
}

// Subclass: Student
public class Student extends Person {
    // Constructor that takes name and course
    Student(String name, String course) {
        super(name); // Call to parent constructor
        System.out.println("Course Enrolled: " + course);
    }

    // Main method
    public static void main(String[] args) {
        // Creating Student object
        Student s = new Student("Rahul", "Computer Science");
    }
}

