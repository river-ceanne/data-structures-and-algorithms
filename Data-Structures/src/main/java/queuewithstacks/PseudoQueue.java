package queuewithstacks;

import stacksandqueues.Stack;

import java.util.EmptyStackException;

public class PseudoQueue {

    protected Stack inbox;
    protected Stack outbox;

    public PseudoQueue(){
        inbox = new Stack();
        outbox = new Stack();
    }

    public PseudoQueue(int cap1, int cap2){
        inbox = new Stack(cap1);
        outbox = new Stack(cap2);
    }

    public void enqueue(String val){

        if (inbox.isFull()){
            if(outbox.isFull()) throw new StackOverflowError();
            else{
                while (!inbox.isEmpty() && !outbox.isFull()){
                    outbox.push(inbox.pop());
                }
                inbox.push(val);
            }
        }else{
            inbox.push(val);
        }

    }

    public String dequeue(){
        if(outbox.isEmpty()){

            if(inbox.isEmpty()) throw new EmptyStackException();

            while(!inbox.isEmpty()){
                outbox.push(inbox.pop());
            }

        }

        return outbox.pop();
    }

}
