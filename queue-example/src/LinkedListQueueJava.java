import java.util.LinkedList;
import java.util.Queue;
public class LinkedListQueueJava {
    public static void main(String[] args) {
            Queue<Integer> queue = new LinkedList<>();

            queue.add(10);
        System.out.println(queue);
            queue.add(20);
        System.out.println(queue);
            queue.add(30);
        System.out.println(queue);
            queue.remove();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
            System.out.println("Queue is empty: " + queue.isEmpty());
            System.out.println("Front item: " + queue.peek());


    }
}


