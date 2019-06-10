package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {


//   -------------------------- Stacks & Queues Tests --------------------------------

    //Can successfully enqueue into a queue
    //Can successfully enqueue multiple values into a queue
    //Can successfully dequeue out of a queue the expected value
    //Can successfully peek into a queue, seeing the expected value
    //Can successfully empty a queue after multiple dequeues
    //Can successfully instantiate an empty queue

    @Test
    public void testQueueDefultConstructor(){
        Queue queue = new Queue();
        assertEquals(100,queue.capacity);
        assertEquals(0,queue.front);
        assertEquals(-1,queue.rear);
        assertNull(queue.queue[queue.front]);
    }

    @Test
    public void testQueueConstructor(){
        Queue queue = new Queue(10);
        assertEquals(10,queue.capacity);
        assertEquals(0,queue.front);
        assertEquals(-1,queue.rear);
        assertNull(queue.queue[queue.front]);

    }

    @Test
    public void testQueueEnqueue(){
        Queue queue = new Queue(10);
        assertTrue(queue.isEmpty());
        queue.enqueue("Bubbles");
        assertEquals("Bubbles",queue.queue[queue.front].getValue());
        assertEquals(0,queue.rear);

    }

    @Test
    public void testQueueEnqueueMultiple(){
        Queue queue = new Queue(10);
        assertTrue(queue.isEmpty());
        queue.enqueue("Bubbles");
        queue.enqueue("Blossom");
        queue.enqueue("Buttercup");
        assertEquals("Bubbles",queue.queue[queue.front].getValue());
        assertEquals("Blossom",queue.queue[queue.front + 1].getValue());
        assertEquals("Buttercup",queue.queue[queue.front + 2].getValue());
        assertEquals(2,queue.rear);

    }

    @Test
    public void testQueueDequeue(){
        Queue queue = new Queue(10);
        queue.enqueue("Bubbles");
        queue.enqueue("Blossom");
        queue.enqueue("Buttercup");
        assertEquals("Bubbles",queue.dequeue());

    }

    @Test
    public void testQueueDequeueMultiple(){
        Queue queue = new Queue(10);
        assertTrue(queue.isEmpty());
        queue.enqueue("Bubbles");
        queue.enqueue("Blossom");
        queue.enqueue("Buttercup");
        assertEquals("Bubbles",queue.dequeue());
        assertEquals("Blossom",queue.dequeue());
        assertEquals("Buttercup",queue.dequeue());
        assertTrue(queue.isEmpty());

    }

    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void testQueueDequeueMultipleToEmpty(){
        Queue queue = new Queue(10);
        assertTrue(queue.isEmpty());
        queue.enqueue("Bubbles");
        queue.enqueue("Blossom");
        queue.enqueue("Buttercup");
        assertEquals("Bubbles",queue.dequeue());
        assertEquals("Blossom",queue.dequeue());
        assertEquals("Buttercup",queue.dequeue());
        assertTrue(queue.isEmpty());
        queue.dequeue();

    }

    @Test
    public void testQueuePeek(){
        Queue queue = new Queue(10);
        assertTrue(queue.isEmpty());
        queue.enqueue("Bubbles");
        queue.enqueue("Blossom");
        queue.enqueue("Buttercup");
        assertEquals(0,queue.front);
        assertEquals("Bubbles",queue.peek());
        assertEquals(0,queue.front);

    }
}
