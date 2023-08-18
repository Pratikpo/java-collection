/**
 * Stack is a data structure that is built using array.
 * Stack DS follows Last in First Out - LIFO
 * It performs following operations -
 *  1. Push - this means add an item on top of stack
 *  2. Pop - this means remove an item from top of stack
 *  3. peek - this means return top of stack without removing top element.

 *  Other two stack operations are-
 *  1. IsEmpty - this checks whether stack is empty or not
 *  2. IsFull - this checks whether stack is full or not

 */
public class Stack {
    int capacity;//The maximum number of items that can be stored in the stack.
    int[] stack;//The array that holds the stack elements
    int top;//Pointer to the top element of the stack

    public Stack(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;// Initialize top to -1, indicating an empty stack

    }
    // Pushes an item onto the top of the stack
    void push(int item){
        if (isFull()){
            System.out.println("Stack is full, cannot add item " + item);
        }else {
            stack[++top]=item;// Increment top and add the item to the stack
            System.out.println("Item " + item + " pushed onto the stack at position " + top);
            printStack();  // Print the current state of the stack
        }
    }
    // Pops (removes) the top item from the stack
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot pop an item");
            return -1;
        } else {
            int topElement = stack[top];  // Get the top element
            stack[top] = 0;  // Reset the value at the top position
            top--;  // Decrement top to point to the new top element
            System.out.println("Item " + topElement + " popped from the stack at position " + top);
            printStack();  // Print the current state of the stack
            return topElement;
        }
    }
    // Returns the top element of the stack without removing it
    int peek() {
        return stack[top];
    }
    // Checks if the stack is empty
    boolean isEmpty() {
        return top == -1;
    }
    // Checks if the stack is full
    boolean isFull() {
        return top == capacity - 1;
    }
    // Prints the current state of the stack
    void printStack() {
        System.out.println("capacity = " + capacity);
        System.out.println("stack elements:");
        for (int i = capacity - 1; i >= 0; i--) {    //This loop iterates through the stack array in reverse order, starting from the index of the last element (top of the stack) down to index 0 (bottom of the stack
            System.out.println("item in stack at index [" + i + "] item = [" + stack[i] + "]");
        }
        System.out.println("top = " + top);
    }

}
