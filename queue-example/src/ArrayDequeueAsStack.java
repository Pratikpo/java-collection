import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueAsStack {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Resizable-array implementation of the Deque interface.
         * Array deques have no capacity restrictions;
         * they grow as necessary to support usage.
         * They are not thread-safe;
         * lll
         * in the absence of external synchronization,
         * they do not support concurrent access by multiple threads.
         * Null elements are prohibited.
         * This class is likely to be faster than Stack when used as a stack,
         * and faster than LinkedList when used as a queue.
         */
        Deque<Integer> Integer = new ArrayDeque<>();
        Integer.push(10);
        print(Integer);
        Integer.push(20);
        print(Integer);
        Integer.push(30);
        print(Integer);
        Integer.push(40);
        print(Integer);
        Integer.pop();
        print(Integer);
        Integer.pop();
        print(Integer);
        Integer.push(50);
        print(Integer);
        Integer.push(60);
        print(Integer);



    }static void print(Deque<Integer> Integer) throws InterruptedException {
        System.out.println(Integer);
        Thread.sleep(2000);
    }

}
