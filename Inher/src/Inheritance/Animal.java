package Inheritance;

// Base class
public class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }

    public static void main(String[] args) {
        // Single Inheritance
        Dog dog = new Dog();
        System.out.println("Single Inheritance:");
        dog.eat();
        dog.bark();

        // Multilevel Inheritance
        Puppy puppy = new Puppy();
        System.out.println("\nMultilevel Inheritance:");
        puppy.eat();
        puppy.bark();
        puppy.weep();

        // Hierarchical Inheritance
        Cat cat = new Cat();
        System.out.println("\nHierarchical Inheritance:");
        cat.eat();
        cat.meow();

        // Hybrid Inheritance (via interface)
        Tiger tiger = new Tiger();
        System.out.println("\nHybrid Inheritance:");
        tiger.eat();
        tiger.hunt();
    }
}

// Single Inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Multilevel Inheritance
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps.");
    }
}

// Hierarchical Inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}

// Hybrid Inheritance using Interface
interface Wild {
    void hunt();
}

class Tiger extends Animal implements Wild {
    public void hunt() {
        System.out.println("Tiger hunts.");
    }
}
