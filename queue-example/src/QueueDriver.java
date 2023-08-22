public class QueueDriver {
    public static void main(String[] args) {
        Queue queue = new Queue(3);
        queue.dequeue();


        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("peek element of the queue"+queue.peek());
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(20);
        queue.enqueue(30);




    }
}
