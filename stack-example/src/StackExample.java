import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        System.out.println("is empty " + stack.empty());
        System.out.println("peek " + stack.peek());
        System.out.println("Stack elements:");
        stack.forEach(System.out::println);
        System.out.println("Search for 10: Position = " + stack.search(10));
        System.out.println("***************");

        stack.push(20);
        System.out.println("is empty " + stack.empty());
        System.out.println("peek " + stack.peek());
        System.out.println("Stack elements:");
        stack.forEach(System.out::println);
        System.out.println("Search for 20: Position = " + stack.search(20));
        System.out.println("***************");

        stack.pop();
        System.out.println("is empty " + stack.empty());
        System.out.println("peek " + stack.peek());
        System.out.println("Stack elements:");
        stack.forEach(System.out::println);
        System.out.println("Search for 20: Position = " + stack.search(20));
        System.out.println("***************");

        stack.push(30);
        System.out.println("is empty " + stack.empty());
        System.out.println("peek " + stack.peek());
        System.out.println("Stack elements:");
        stack.forEach(System.out::println);
        System.out.println("Search for 30: Position = " + stack.search(30));
        System.out.println("***************");

        stack.push(40);
        System.out.println("is empty " + stack.empty());
        System.out.println("peek " + stack.peek());
        System.out.println("Stack elements:");
        stack.forEach(System.out::println);
        System.out.println("Search for 50: Position = " + stack.search(50));
        System.out.println("***************");
    }
}
