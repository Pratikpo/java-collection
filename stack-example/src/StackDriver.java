public class StackDriver {
    public static void main(String[] args) {
        // Create a new instance of the Stack class with a capacity of 3
        Stack newStack = new Stack(3);

        // Attempt to pop an item from the empty stack (should display a message)
        newStack.pop();

        // Push the value 10 onto the stack
        newStack.push(10);

        // Push the value 20 onto the stack
        newStack.push(20);
        newStack.pop();

        newStack.pop();


        //System.out.println("Top element of the stack is "+newStack.peek());
        //newStack.printStack();
        newStack.push(60);
        newStack.push(70);

        System.out.println("Top element of the stack is "+newStack.peek());
    }
}
