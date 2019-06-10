package stacksandqueues;

import Data.Structures.Node;

public class Stack {

    // Create a Stack class that has a top property. It creates an empty Stack when instantiated.
    // This object should be aware of a default empty value assigned to top when the stack is created.
    // Define a method called push which takes any value as an argument and adds a new node with that
    // value to the top of the stack with an O(1) Time performance.
    // Define a method called pop that does not take any argument, removes the node from the top of the stack,
    // and returns the node’s value.
    // Define a method called peek that does not take an argument and returns the value of the node located on top of the stack,
    // without removing it from the stack.

    private Node[] stack;
    private int top;
    private int capacity;
    private final int MAX_DEFAULT = 100;

    public Stack(){
        this.capacity = MAX_DEFAULT;
        this.stack = new Node[MAX_DEFAULT];
        this.top = -1;
    }

    public Stack(int capacity){
        this.capacity = capacity;
        this.stack = new Node[capacity];
        this.top = -1;
    }

    public void push(String val){
        if (isFull()) throw new AssertionError("Stack is Full! Stack Overflow!");
        Node newNode = new Node(val);
        top++;
        stack[top] = newNode;
    }

    public String pop(){
        if (isEmpty()) throw new AssertionError("Stack is Empty! Stack underflow!");
        String val = stack[top].getValue();
        top--;
        return val;
    }

    public String peek(){
        if (isEmpty()) throw new AssertionError("Stack is Empty! Stack underflow!");
        return stack[top].getValue();
    }

    private boolean isEmpty(){
       return top == -1;
    }

    private boolean isFull(){
        return top - 1 == capacity;
    }
}
