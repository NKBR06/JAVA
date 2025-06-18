package list;
import java.util.*;
public class StudentList {
	public static void main(String[] args) {
		List<String> student = new ArrayList<>();
		student.add("Amit");
		student.add("Neha");
		student.add("Ravi");
		
		System.out.println("student names:");
		for(String name: student) {
			System.out.println(name);
		}
	}

}
