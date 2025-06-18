package librarysystem;

import java.util.Scanner;

class Book {
    protected String title;
    protected String author;
    protected String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}

class ScienceBook extends Book {
    private String fieldOfStudy;

    public ScienceBook(String title, String author, String isbn, String fieldOfStudy) {
        super(title, author, isbn);
        this.fieldOfStudy = fieldOfStudy;
    }

    @Override
    public void printDetails() {
        System.out.println("[Science Book]");
        super.printDetails();
        System.out.println("Field of Study: " + fieldOfStudy);
        System.out.println("________________________________________");
    }
}

class NovelBook extends Book {
    private String genre;

    public NovelBook(String title, String author, String isbn, String genre) {
        super(title, author, isbn);
        this.genre = genre;
    }

    @Override
    public void printDetails() {
        System.out.println("[Novel Book]");
        super.printDetails();
        System.out.println("Genre: " + genre);
        System.out.println("________________________________________");
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Add Book Type (ScienceBook/NovelBook): ");
        String type = sc.nextLine();

        System.out.print("Title: ");
        String title = sc.nextLine();

        System.out.print("Author: ");
        String author = sc.nextLine();

        System.out.print("ISBN: ");
        String isbn = sc.nextLine();

        if (type.equalsIgnoreCase("ScienceBook")) {
            System.out.print("Field of Study: ");
            String field = sc.nextLine();
            ScienceBook sb = new ScienceBook(title, author, isbn, field);
            sb.printDetails();
        } else if (type.equalsIgnoreCase("NovelBook")) {
            System.out.print("Genre: ");
            String genre = sc.nextLine();
            NovelBook nb = new NovelBook(title, author, isbn, genre);
            nb.printDetails();
        } else {
            System.out.println("Invalid Book Type.");
        }

        sc.close();
    }
}
