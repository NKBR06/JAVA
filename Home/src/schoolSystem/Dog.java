package schoolSystem;

// Base class: Animal
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Derived class: Dog
public class Dog extends Animal {

    // Overriding makeSound method
    @Override
    void makeSound() {
        super.makeSound();           // Call parent class method
        System.out.println("Bark!"); // Dog-specific behavior
    }

    // Main method
    public static void main(String[] args) {
        Dog d = new Dog();     // Create Dog object
        d.makeSound();         // Call overridden method
    }
}

