package vector;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<String> students = new Vector<>();
		students.add("Nisarga C M");
		students.add("nikhil");
		students.add("jyothsna");
		
		System.out.println("First student: "+ students.get(0));

	}

}
