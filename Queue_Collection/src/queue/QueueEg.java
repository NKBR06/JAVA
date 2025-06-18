package queue;

import java.util.LinkedList;
import java.util.Queue;
public class QueueEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new LinkedList<>();
		queue.offer("Apple");
		queue.offer("Banana");
		queue.offer("cherry");
		System.out.println("Front of queue:"+queue.peek());
		while(!queue.isEmpty()) {
			System.out.println("removed"+queue.poll());
		}
		System.out.println("queue empty"+queue.isEmpty());
		

	}

}
