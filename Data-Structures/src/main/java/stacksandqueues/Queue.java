package stacksandqueues;

import Data.Structures.Node;

public class Queue {

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
        return queue[front++].getValue();
    }

    public String peek(){
        if (isEmpty()) throw new ArrayIndexOutOfBoundsException("Queue is Empty. Nothing to peek!");
        return queue[front].getValue();
    }

    public boolean isEmpty(){
        return front -1 == rear;
    }

    public boolean isFull(){
        return rear == capacity - 1;
    }

}
