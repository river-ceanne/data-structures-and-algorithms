package Data.Structures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HashtableTest {
//Write tests to prove the following functionality:
//
//Adding a key/value to your hashtable results in the value being in the data structure
//Retrieving based on a key returns the value stored
//Successfully returns null for a key that does not exist in the hashtable
//Successfully handle a collision within the hashtable
//Successfully retrieve a value from a bucket within the hashtable that has a collision
//Successfully hash a key to an in-range value

    @Test
    public void testHashtableInstantiation(){
        Hashtable hashtable = new Hashtable(10);
        assertEquals(10,hashtable.map.length);
    }

    @Test
    public void testHashtableAdd(){
        Hashtable hashtable = new Hashtable(10);
        hashtable.add("bubbles","the value");
        assertEquals("the value",hashtable.get("bubbles"));
    }

    @Test
    public void testHashtableReturnNull(){
        Hashtable hashtable = new Hashtable(10);
        hashtable.add("bubbles","the value");
        assertEquals(null,hashtable.get("bloop"));
    }

    @Test
    public void testHashtableHandleColl(){
        Hashtable hashtable = new Hashtable(10);
        hashtable.add("bubbles","the value");
        hashtable.add("bubbles","the second value");
        assertEquals("the second value",hashtable.get("bubbles"));

    }


    @Test
    public void testHashtableHandleCollRetreival(){
        Hashtable hashtable = new Hashtable(10);
        hashtable.add("bubbles","the value");
        hashtable.add("bubbles","the second value");
        assertEquals("the second value",hashtable.get("bubbles"));
        assertEquals("the value",hashtable.map[hashtable.hash("bubbles")].getNextNode().getValue());

    }

}
