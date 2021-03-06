package queuewithstacks;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.assertEquals;

public class PseudoQueueTest {

    @Test
    public void testPseudoQueueDefultConstructor(){
        PseudoQueue pseudoQueue = new PseudoQueue();
        assertEquals(-1,pseudoQueue.inbox.getTop());
        assertEquals(-1,pseudoQueue.outbox.getTop());
        assertEquals(100,pseudoQueue.inbox.getCapacity());
        assertEquals(100,pseudoQueue.outbox.getCapacity());
    }

    @Test
    public void testPseudoQueueConstructor(){
        PseudoQueue pseudoQueue = new PseudoQueue(10,10);
        assertEquals(-1,pseudoQueue.inbox.getTop());
        assertEquals(-1,pseudoQueue.outbox.getTop());
        assertEquals(10,pseudoQueue.inbox.getCapacity());
        assertEquals(10,pseudoQueue.outbox.getCapacity());
    }

    @Test
    public void testPseudoQueueEnqueue(){
        PseudoQueue pseudoQueue = new PseudoQueue(10,10);
        pseudoQueue.enqueue("Bubbles");
        assertEquals("Bubbles",pseudoQueue.inbox.peek());
        assertEquals(0,pseudoQueue.inbox.getTop());
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
