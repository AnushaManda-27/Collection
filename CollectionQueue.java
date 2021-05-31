import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionQueue {
	public static void main(String[] args) {
		
		Queue<String> queue = new PriorityQueue<>();
		
		queue.add("Anusha");
		queue.add("Manda");
		queue.add("pushpa");
		queue.add("Ajith");
		System.out.println("Queue" +queue);
		queue.remove();
		System.out.println("Queue" +queue);
		queue.poll();		
		System.out.println("Queue" +queue);
	}
}
