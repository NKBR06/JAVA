package stack;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> history = new Stack<>();
		history.push("page 1");
		history.push("page 2");
		history.push("push 3");
		
		System.out.println("Back to: "+ history.pop());

	}

}