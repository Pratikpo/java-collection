import java.util.Deque;
import java.util.LinkedList;

public class LinkedListAsDequeueExample {
    public static void main(String[] args) throws InterruptedException {
        Deque<Integer> IntegerQueue =new LinkedList<>();

        IntegerQueue.addFirst(10);
        print(IntegerQueue);
        IntegerQueue.addFirst(20);
        print(IntegerQueue);
        IntegerQueue.addFirst(30);
        print(IntegerQueue);
        IntegerQueue.addFirst(40);
        print(IntegerQueue);
        IntegerQueue.addFirst(50);
        print(IntegerQueue);
        IntegerQueue.removeLast();
        print(IntegerQueue);
        IntegerQueue.removeLast();
        print(IntegerQueue);
        IntegerQueue.removeLast();
        print(IntegerQueue);
        IntegerQueue.removeLast();
        print(IntegerQueue);
        IntegerQueue.removeLast();
        print(IntegerQueue);

    }static void print(Deque<Integer> IntegerQeque) throws InterruptedException {
        System.out.println(IntegerQeque);
        Thread.sleep(2000);
    }
}
