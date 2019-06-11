package stacksandqueues;

import Data.Structures.Node;

public class Stack {

    protected Node[] stack;
    protected int top;
    protected int capacity;
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
        if (isFull()) throw new ArrayIndexOutOfBoundsException("Stack is Full! Stack Overflow!");
        Node newNode = new Node(val);
        top++;
        stack[top] = newNode;
    }

    public String pop(){
        if (isEmpty()) throw new ArrayIndexOutOfBoundsException("Stack is Empty! Stack underflow!");
        String val = stack[top].getValue();
        top--;
        return val;
    }

    public String peek(){
        if (isEmpty()) throw new ArrayIndexOutOfBoundsException("Stack is Empty! Stack underflow!");
        return stack[top].getValue();
    }

    public int getTop() {
        return top;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isEmpty(){
       return top == -1;
    }

    public boolean isFull(){
        return top == capacity - 1;
    }
}
