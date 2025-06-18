package queue;
import java.util.*;

public class PrintQueue {
	public static void main(String[] args) {
		Queue<String> printJobs = new LinkedList<>();
		printJobs.add("Invoice.pdf");
		printJobs.add("Report.doc");
		printJobs.add("photo.jpg");
		
		System.out.println("Printing documents");
		while(!printJobs.isEmpty()) {
			System.out.println("Printings"+printJobs.poll());
		}
	}

}

