package schoolSystem;

// Parent class: Teacher
class Teacher {
    String name = "Mrs. Kapoor"; // Parent name variable

    void teach() {
        System.out.println("Teaching general subjects.");
    }
}

// Child class: SubjectTeacher extends Teacher
public class SubjectTeacher extends Teacher {
    String name = "Mr. Sharma"; // Child name variable

    // Overriding the teach method and calling parent's method using super
    @Override
    void teach() {
        super.teach(); // Call parent method
        System.out.println("Teaching Mathematics.");
    }

    // Method to show both parent and child name variables
    void showNames() {
        System.out.println("Parent name: " + super.name); // Access parent's name
        System.out.println("Child name: " + name);        // Access child's name
    }

    // Main method
    public static void main(String[] args) {
        SubjectTeacher st = new SubjectTeacher(); // Create object
        st.teach();       // Call overridden method
        st.showNames();   // Show both names
    }
}

