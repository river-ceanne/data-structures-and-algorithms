package queuewithstacks;

import org.junit.Test;
import stacksandqueues.Stack;

import java.util.EmptyStackException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PseudoQueueTest {

    @Test
    public void testPseudoQueueDefultConstructor(){
        PseudoQueue pseudoQueue = new PseudoQueue();
        assertEquals(-1,pseudoQueue.firstStack.getTop());
        assertEquals(-1,pseudoQueue.secondStack.getTop());
        assertEquals(100,pseudoQueue.firstStack.getCapacity());
        assertEquals(100,pseudoQueue.secondStack.getCapacity());
    }

    @Test
    public void testPseudoQueueConstructor(){
        PseudoQueue pseudoQueue = new PseudoQueue(10,10);
        assertEquals(-1,pseudoQueue.firstStack.getTop());
        assertEquals(-1,pseudoQueue.secondStack.getTop());
        assertEquals(10,pseudoQueue.firstStack.getCapacity());
        assertEquals(10,pseudoQueue.secondStack.getCapacity());
    }

    @Test
    public void testPseudoQueueEnqueue(){
        PseudoQueue pseudoQueue = new PseudoQueue(10,10);
        pseudoQueue.enqueue("Bubbles");
        assertEquals("Bubbles",pseudoQueue.firstStack.peek());
        assertEquals(0,pseudoQueue.firstStack.getTop());
    }

    @Test (expected = StackOverflowError.class)
    public void testPseudoQueueEnqueueToOverflow(){
        PseudoQueue pseudoQueue = new PseudoQueue(1,2);
        pseudoQueue.enqueue("Bubbles");
        pseudoQueue.enqueue("Blossom");
        pseudoQueue.enqueue("Buttercup");
        pseudoQueue.enqueue("Mojojojo");
    }


    @Test
    public void testPseudoQueueDequeue(){
        PseudoQueue pseudoQueue = new PseudoQueue(10,10);
        pseudoQueue.enqueue("Bubbles");
        assertEquals("Bubbles",pseudoQueue.dequeue());
    }

    @Test
    public void testPseudoQueueDequeueMultiple(){
        PseudoQueue pseudoQueue = new PseudoQueue(10,10);
        pseudoQueue.enqueue("Bubbles");
        pseudoQueue.enqueue("Blossom");
        pseudoQueue.enqueue("Buttercup");
        assertEquals("Bubbles",pseudoQueue.dequeue());
        assertEquals("Blossom",pseudoQueue.dequeue());
        assertEquals("Buttercup",pseudoQueue.dequeue());
    }

    @Test (expected = EmptyStackException.class)
    public void testPseudoQueueDequeueMultipleToException(){
        PseudoQueue pseudoQueue = new PseudoQueue(10,10);
        pseudoQueue.enqueue("Bubbles");
        pseudoQueue.dequeue();
        pseudoQueue.dequeue();
    }




}
