package stacksandqueues;

import Data.Structures.LinkedList;
import Data.Structures.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void testStackDefultConstructor(){
        Stack stack = new Stack();
        assertEquals(100,stack.capacity);
        assertEquals(-1,stack.top);
        assertNull(stack.stack[stack.top + 1]);
    }

    @Test
    public void testStackConstructor(){
        Stack stack = new Stack(10);
        assertEquals(10,stack.capacity);
        assertEquals(-1,stack.top);
        assertNull(stack.stack[stack.top + 1]);
    }

    @Test
    public void testStackPush(){
        Stack stack = new Stack(10);
        stack.push("Bubbles");
        assertEquals("Bubbles",stack.stack[stack.top].getValue());
    }

    @Test
    public void testStackPushMultiple(){
        Stack stack = new Stack(10);
        stack.push("Bubbles");
        stack.push("Blossom");
        stack.push("Bubbles");
        assertEquals(2,stack.top);
    }

    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void testStackPushMultipleToFull(){
        Stack stack = new Stack(2);
        stack.push("Bubbles");
        stack.push("Blossom");
        stack.push("Bubbles");
    }

    @Test
    public void testStackPop(){
        Stack stack = new Stack(10);
        stack.push("Bubbles");
        assertEquals("Bubbles",stack.pop());
    }

    @Test (expected = AssertionError.class)
    public void testStackPopMultipleToEmpty(){
        Stack stack = new Stack(10);
        stack.push("Buttercup");
        stack.push("Blossom");
        stack.push("Bubbles");
        assertEquals("Bubbles",stack.pop());
        assertEquals("Blossom",stack.pop());
        assertEquals("Buttercup",stack.pop());
        stack.pop();
    }

    @Test
    public void testStackPeek(){
        Stack stack = new Stack(10);
        stack.push("Bubbles");
        stack.push("Blossom");
        stack.push("Bubbles");
        assertEquals(2,stack.top);
        assertEquals("Bubbles",stack.peek());
        assertEquals(2,stack.top);
    }


}
