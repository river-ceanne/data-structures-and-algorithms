package code.challenges;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Hashtable;

import static org.junit.Assert.*;

public class LeftJoinTest {

    @Test
    public void testHashMapLeftJoinEmpty(){
        HashMap<String,String> map1 = new HashMap<>();
        HashMap<String,String> map2 = new HashMap<>();
        Hashtable<String, String[]> hashtable = LeftJoin.leftJoin(map1,map2);
        System.out.println(hashtable);
        assertEquals(new Hashtable<>(),hashtable);
    }

    @Test
    public void testHashMapLeftJoin(){

        Hashtable<String, String[]> hashtable = LeftJoin.leftJoin(initializeSyn(),initializeAnt());

//       -------- uncomment to check see contents of hashtable generated ------
//        hashtable.forEach((k,v) -> {
//            System.out.print("key: " + k + " || ");
//            for(String s: v){
//                System.out.print("value: " + s + " | ");
//            }
//            System.out.println();
//        });

        assertFalse(hashtable.containsKey("create"));
        assertNull(hashtable.get("say")[1]);
    }

    @Test
    public void testHashMapLeftJoinOutput(){
        Hashtable<String, String[]> hashtable = LeftJoin.leftJoin(initializeSyn(),initializeAnt());

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        hashtable.forEach((k,v) -> {
            System.out.print("key: " + k + " || ");
            for(String s: v){
                System.out.print("value: " + s + " | ");
            }
            System.out.println();
        });

        assertEquals("key: say || value: tell | value: null | \n" +
                "key: like || value: adore | value: dislike | \n" +
                "key: hate || value: despise | value: loath | \n" +
                "key: annoy || value: aggravate | value: null | \n",outContent.toString());
    }

    private HashMap<String,String> initializeSyn(){
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("like","adore");
        hashMap.put("hate","despise");
        hashMap.put("annoy","aggravate");
        hashMap.put("say","tell");
        return hashMap;
    }

    private HashMap<String,String> initializeAnt(){
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("like","dislike");
        hashMap.put("hate","loath");
        hashMap.put("create","make");
        return hashMap;
    }

}
