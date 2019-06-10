package stacksandqueues;

import Data.Structures.Node;

public class Queue {

    // Create a Queue class that has a top property. It creates an empty Queue when instantiated.
    // This object should be aware of a default empty value assigned to front when the queue is created.
    // Define a method called enqueue which takes any value as an argument and adds a new node with that
    // value to the back of the queue with an O(1) Time performance.
    // Define a method called dequeue that does not take any argument, removes the node from the front of the queue,
    // and returns the node’s value.
    // Define a method called peek that does not take an argument and returns the value of the node located
    // in the front of the queue, without removing it from the queue.

    protected int front;
    protected int rear;
    protected int capacity;
    protected Node[] queue;
    private final int MAX = 100;

    public Queue(){
        queue = new Node[MAX];
        capacity = MAX;
        front = 0;
        rear = -1;
    }

    public Queue(int capacity){
        this.capacity = capacity;
        queue = new Node[capacity];
        front = 0;
        rear = -1;
    }

    public void enqueue(String var){
        if (isFull()) throw new ArrayIndexOutOfBoundsException("Queue is Full. Cannot Equeue!");
        Node newNode = new Node(var);
        queue[++rear] = newNode;
    }

    public String dequeue(){
        if (isEmpty()) throw new ArrayIndexOutOfBoundsException("Queue is Empty. Cannot Dequeue!");
        return queue[rear--].getValue();
    }

    public String peek(){
        if (isEmpty()) throw new ArrayIndexOutOfBoundsException("Queue is Empty. Nothing to peek!");
        return queue[front].getValue();
    }

    public boolean isEmpty(){
        return rear == -1;
    }

    public boolean isFull(){
        return rear == capacity - 1;
    }

}
