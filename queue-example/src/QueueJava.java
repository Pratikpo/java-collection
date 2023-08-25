import java.util.LinkedList;
import java.util.Queue;
public class QueueJava {
    public static void main(String[] args) {
            Queue<Integer> queue = new LinkedList<>();

            queue.add(10);
            queue.add(20);
            queue.add(30);
            queue.remove();

            System.out.println("Queue is empty: " + queue.isEmpty());
            System.out.println("Front item: " + queue.peek());


    }
}


