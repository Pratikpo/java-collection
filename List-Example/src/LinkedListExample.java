public class LinkedListExample {
    Node head;

    LinkedListExample() {
        head = null;
    }

     static class Node {
         int data;
         Node next;

         Node(int data, Node next) {
             this.data = data;
             this.next = next;
         }
     }

        void addNode(Node newNode) throws InterruptedException {
            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next; // traverse to next node
                }
                temp.next = newNode;
            }
            printNode();
        }

        void deleteNode(int index) throws InterruptedException {
            if (index == 0) {
                if (head != null)
                    head = head.next;
            } else {
                Node temp = head;
                Node previous = head;
                int count = 0;
                while (count < index) {
                    previous = temp;
                    temp = temp.next;
                    count++;
                }
                previous.next = temp.next;
            }
            printNode();
        }

        void printNode() throws InterruptedException {
            Node temp = head;
            while (temp != null) {
                System.out.println("[" + temp.data + "|" + (temp.next != null ? temp.next.hashCode() : null) + "]--->");
                temp = temp.next;

                    Thread.sleep(3000);

            }
            System.out.println("null");
            System.out.println("\n------------------------");
        }


    public static void main(String[] args) throws InterruptedException {
        Node first = new Node(10, null);
        Node second = new Node(20, null);
        Node third = new Node(30, null);
        Node fourth = new Node(40, null);
        Node fifth = new Node(50, null);

        LinkedListExample linkedListExample = new LinkedListExample();
        linkedListExample.addNode(first); // Set the head to the first node
        linkedListExample.addNode(second);
        linkedListExample.addNode(third);
        linkedListExample.addNode(fourth);
        linkedListExample.addNode(fifth);
        linkedListExample.deleteNode(0);
        linkedListExample.deleteNode(2);
    }
}
