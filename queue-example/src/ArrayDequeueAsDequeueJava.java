import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueAsDequeueJava {
    /**
     * Resizable-array implementation of the Deque interface.
     * Array deques have no capacity restrictions;
     * they grow as necessary to support usage.
     * They are not thread-safe;
     * in the absence of external synchronization,
     * they do not support concurrent access by multiple threads.
     * Null elements are prohibited.
     * This class is likely to be faster than Stack when used as a stack,
     * and faster than LinkedList when used as a queue.
     */

    /**
     * Queue
     * Deque imp Queue
     * ArrayDeque & LinkedList both imp Deque
     *
     */
    public static void main(String[] args) throws InterruptedException {
        Deque<Integer> ArrayDequeue = new ArrayDeque<>();
        ArrayDequeue.addFirst(10);
        print(ArrayDequeue);
        ArrayDequeue.addFirst(20);
        print(ArrayDequeue);
        ArrayDequeue.addLast(30);
        print(ArrayDequeue);
        ArrayDequeue.addLast(40);
        print(ArrayDequeue);
        ArrayDequeue.removeFirst();
        print(ArrayDequeue);
        ArrayDequeue.removeLast();
        print(ArrayDequeue);
        ArrayDequeue.removeFirst();
        print(ArrayDequeue);
        ArrayDequeue.removeLast();
        print(ArrayDequeue);


    }static void print(Deque<Integer> ArraDequeue) throws InterruptedException {
        System.out.println(ArraDequeue);
        Thread.sleep(2000);
    }
}
