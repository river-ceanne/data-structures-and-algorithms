package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

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
