public class QueueExample {
    static class Queue {
        private int arr[];
        private int maxSize;
        private int front;
        private int rear;

        Queue(int maxSize) {
            this.maxSize = maxSize;
            arr = new int[maxSize];
            front = 0;
            rear = -1;
        }

        public boolean isEmpty() {
            return front > rear;
        }

        public boolean isFull() {
            return rear == maxSize - 1;
        }

        public void enqueue(int data) {
            if (isFull()) {
                System.out.println("Queue is full. Cannot enqueue.");
                return;
            }
            arr[++rear] = data;
            printQueue();
        }

        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty. Cannot dequeue.");
                return -1;
            }else {
            int frontElement = arr[front];

            front++;
                return frontElement;

            }



        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty. Cannot peek.");
                return -1;
            }
            return arr[front];
        }
        public void printQueue() {
            System.out.println("-------------" + "Queue content is: " + "------------");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println("\n--------------------");
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println("Peek: " + q.peek());
        System.out.println("Dequeue: " + q.dequeue());
        System.out.println("Dequeue: " + q.dequeue());
        //System.out.println("Dequeue: " + q.dequeue());

        q.printQueue();
        System.out.println("Peek: " + q.peek());

        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(5);

    }
}
