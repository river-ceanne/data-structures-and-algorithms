package queuewithstacks;

import stacksandqueues.Stack;

public class PseudoQueue {

    protected Stack firstStack;
    protected Stack secondStack;

    public PseudoQueue(){
        firstStack = new Stack();
        secondStack = new Stack();
    }

    public PseudoQueue(int cap1, int cap2){
        firstStack = new Stack(cap1);
        secondStack = new Stack(cap2);
    }

    public void enqueue(String val){
        if (firstStack.isFull()) throw new AssertionError();
        firstStack.push(val);
    }

    public String dequeue(){
        if(secondStack.isEmpty()){
            while(!firstStack.isEmpty()){
                secondStack.push(firstStack.pop());
            }

        }

        return secondStack.pop();
    }

}
