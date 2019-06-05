/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Data.Structures;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testLinkedListInstantiation(){
        LinkedList linkedList = new LinkedList();
        assertEquals(null,linkedList.getHead());
    }

    @Test
    public void testLinkedListInsert(){

        LinkedList linkedList = new LinkedList();
        linkedList.insert("one");

        assertEquals("one",linkedList.getHead().getValue());

        linkedList.insert("two");
        Node temp = linkedList.getHead();
        linkedList.insert("three");

        assertEquals(temp,linkedList.getHead().getNextNode());
    }

    @Test
    public void testLinkedListPrint() {

        LinkedList linkedList = new LinkedList();

        linkedList.insert("one");
        linkedList.insert("two");
        linkedList.insert("three");

        ArrayList<String> res = linkedList.print();

        ArrayList<String> expected = new ArrayList<>();
        expected.add("three");
        expected.add("two");
        expected.add("one");

        assertEquals(expected.size(),res.size());
        assertEquals(expected,res);

    }

    @Test
    public void testLinkedListIncludesTrue() {

        LinkedList linkedList = new LinkedList();

        linkedList.insert("one");
        linkedList.insert("two");
        linkedList.insert("three");

        assertTrue("testing linked list is true: ",
                linkedList.includes("two",linkedList.getHead()));

    }

    @Test
    public void testLinkedListIncludesFalse() {

        LinkedList linkedList = new LinkedList();

        linkedList.insert("one");
        linkedList.insert("two");
        linkedList.insert("three");

        assertFalse("testing linked list is true: ",
                linkedList.includes("five",linkedList.getHead()));

    }

    @Test
    public void testLinkedListAppend() {

        LinkedList linkedList = new LinkedList();

        linkedList.insert("firstInsert");
        linkedList.insert("mid");
        linkedList.insert("lastInsert");
        linkedList.append("the append");

        Node scanner = linkedList.getHead();
        String lastVal = "";

        while(scanner != null){

            if(scanner.getNextNode() == null)
                lastVal = scanner.getValue();

            scanner = scanner.getNextNode();
        }

        assertEquals("the append",lastVal);


    }

    @Test
    public void testLinkedListAppendMultiple() {

        LinkedList linkedList = new LinkedList();


        linkedList.insert("firstInsert");
        linkedList.insert("mid");
        linkedList.insert("lastInsert");
        linkedList.append("first append");

        Node scanner = linkedList.getHead();
        String lastVal = "";
        while(scanner != null){
            if(scanner.getNextNode() == null)
                lastVal = scanner.getValue();

            scanner = scanner.getNextNode();
        }

        assertEquals("first append",lastVal);
        scanner = linkedList.getHead();
        linkedList.append("second append");

        while(scanner != null){
            if(scanner.getNextNode() == null)
                lastVal = scanner.getValue();

            scanner = scanner.getNextNode();
        }

        assertEquals("second append",lastVal);

        scanner = linkedList.getHead();
        linkedList.append("the append");

        while(scanner != null){
            if(scanner.getNextNode() == null)
                lastVal = scanner.getValue();

            scanner = scanner.getNextNode();
        }

        assertEquals("the append",lastVal);

    }

    @Test
    public void testInsertBefore(){
        LinkedList linkedList = new LinkedList();

        linkedList.insert("four");
        linkedList.insert("three");
        linkedList.insert("two");
        linkedList.insert("one");

        linkedList.insertBefore("three","two and a half");

        ArrayList<String> arrayList = new ArrayList<>();
        Node scanner = linkedList.getHead();

        while(scanner != null){
            arrayList.add(scanner.getValue());
            scanner = scanner.getNextNode();
        }

        if(arrayList.contains("three")){
            int index = arrayList.indexOf("three");
            assertEquals("two and a half",arrayList.get(index - 1));
        }

    }

    @Test
    public void testInsertBeforeFirst(){
        LinkedList linkedList = new LinkedList();

        linkedList.insert("four");
        linkedList.insert("three");
        linkedList.insert("two");
        linkedList.insert("one");

        linkedList.insertBefore("one","a half");

        ArrayList<String> arrayList = new ArrayList<>();
        Node scanner = linkedList.getHead();

        while(scanner != null){
            arrayList.add(scanner.getValue());
            scanner = scanner.getNextNode();
        }

        if(arrayList.contains("one")){
            int index = arrayList.indexOf("one");
            assertEquals("a half",arrayList.get(index - 1));
        }

    }


    @Test
    public void testInsertAfter(){
        LinkedList linkedList = new LinkedList();

        linkedList.insert("four");
        linkedList.insert("three");
        linkedList.insert("two");
        linkedList.insert("one");

        linkedList.insertAfter("three","three and a half");

        ArrayList<String> arrayList = new ArrayList<>();
        Node scanner = linkedList.getHead();

        while(scanner != null){
            arrayList.add(scanner.getValue());
            scanner = scanner.getNextNode();

        }

        if(arrayList.contains("three")){
            int index = arrayList.indexOf("three");
            assertEquals("three and a half",arrayList.get(index + 1));
        }

    }

    @Test
    public void testInsertAfterLast(){
        LinkedList linkedList = new LinkedList();

        linkedList.insert("four");
        linkedList.insert("three");
        linkedList.insert("two");
        linkedList.insert("one");

        linkedList.insertAfter("four","four and a half");

        ArrayList<String> arrayList = new ArrayList<>();
        Node scanner = linkedList.getHead();

        while(scanner != null){
            arrayList.add(scanner.getValue());
            scanner = scanner.getNextNode();
        }

        if(arrayList.contains("four")){
            int index = arrayList.indexOf("four");
            assertEquals("four and a half",arrayList.get(index + 1));
        }

    }

    @Test
    public void testGetKth(){
        LinkedList linkedList = new LinkedList();

        linkedList.insert("four");
        linkedList.insert("three");
        linkedList.insert("two");
        linkedList.insert("one");

        assertEquals("two",linkedList.getKth(2));
        assertEquals("one",linkedList.getKth(3));

    }

    @Test
    public void testLinkedListToString(){
        LinkedList linkedList = new LinkedList();

        linkedList.insert("four");
        linkedList.insert("three");
        linkedList.insert("two");
        linkedList.insert("one");

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        System.out.println(linkedList);

        assertEquals("one\n" +
                "two\n" +
                "three\n" +
                "four\n\n",outContent.toString());
    }



}
