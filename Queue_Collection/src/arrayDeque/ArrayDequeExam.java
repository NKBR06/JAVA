package arrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;
public class ArrayDequeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> deque = new ArrayDeque<>();
		deque.offerFirst("start");
		deque.offerLast("End");
		System.out.println("From front:"+deque.pollFirst());
		System.out.println("From back:"+deque.pollLast());
		

	}

}
