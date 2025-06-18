package schoolSystem;

// Base class: LibraryItem
class LibraryItem {
    String title;

    // Constructor to initialize title
    LibraryItem(String title) {
        this.title = title;
    }

    // Method to display title
    void displayInfo() {
        System.out.println("Title: " + title);
    }
}

// Derived class: Book
public class Book extends LibraryItem {
    String author;

    // Constructor to initialize title and author
    Book(String title, String author) {
        super(title); // Call to parent constructor
        this.author = author;
    }

    // Overridden method to display both title and author
    @Override
    void displayInfo() {
        super.displayInfo(); // Call to parent method
        System.out.println("Author: " + author);
    }

    // Main method
    public static void main(String[] args) {
        // Create Book object
        Book book = new Book("Java Basics", "James Gosling");
        book.displayInfo(); // Display information
    }
}

