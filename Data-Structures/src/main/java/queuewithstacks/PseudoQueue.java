package queuewithstacks;

import stacksandqueues.Stack;

import java.util.EmptyStackException;

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

        if (firstStack.isFull()){
            if(secondStack.isFull()) throw new StackOverflowError();
            else{
                while (!firstStack.isEmpty() && !secondStack.isFull()){
                    secondStack.push(firstStack.pop());
                }
                firstStack.push(val);
            }
        }else{
            firstStack.push(val);
        }

    }

    public String dequeue(){
        if(secondStack.isEmpty()){

            if(firstStack.isEmpty()) throw new EmptyStackException();

            while(!firstStack.isEmpty()){
                secondStack.push(firstStack.pop());
            }

        }

        return secondStack.pop();
    }

}
