package Inheritance;

import java.util.Scanner;


public class book {
	
	String title;
	
	void read() {
		System.out.println("Reading: " + title );
	}
}
class Ebook extends book {
	void download() {
		System.out.println("Ebook \"" + title + "\" download.");
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Ebook ebook = new Ebook();
		
		System.out.println("Enter the title of ebook: ");
		ebook.title = scanner.nextLine();
		
		ebook.download();
		ebook.read();
		
		scanner.close();

	}

}
