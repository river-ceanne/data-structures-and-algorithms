package code.challenges;

import graph.Graph;
import graph.Node;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class BreadthFirstTest {

    @Test
    public void testBreadthFirstGetName(){
        Node<String> node = new Node<>("node");
        HashSet<Node<String>> res = BreadthFirst.breadthFirst(node);

        assertEquals("node",res.iterator().next().getName());

    }

    @Test
    public void testBreadthFirstOneNode(){
        Node<String> node = new Node<>("only one");
        HashSet<Node<String>> res = BreadthFirst.breadthFirst(node);

        HashSet<Node<String>> exp = new HashSet<>();
        exp.add(node);
        assertEquals(exp,res);

    }

    @Test
    public void testBreadthFirst(){
        HashSet<Node<String>> res = BreadthFirst.breadthFirst(initialize());

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        for(Node<String> node: res){
            System.out.println(node.getName());
        }


        assertEquals("1\n" +
                "2\n" +
                "5\n" +
                "4\n" +
                "3\n", outContent.toString());
    }

    private Node<String> initialize(){
        Node<String> node1 = new Node<>("1");
        Node<String> node2 = new Node<>("2");
        Node<String> node3 = new Node<>("3");
        Node<String> node4 = new Node<>("4");
        Node<String> node5 = new Node<>("5");

        ArrayList<Node<String>> neighbor1 = new ArrayList<>();
        neighbor1.add(node2);
        neighbor1.add(node5);
        node1.setNeighbors(neighbor1);

        ArrayList<Node<String>> neighbor2 = new ArrayList<>();
        neighbor2.add(node1);
        neighbor2.add(node3);
        node2.setNeighbors(neighbor2);

        ArrayList<Node<String>> neighbor3 = new ArrayList<>();
        neighbor3.add(node2);
        neighbor3.add(node4);
        node3.setNeighbors(neighbor3);

        ArrayList<Node<String>> neighbor4 = new ArrayList<>();
        neighbor4.add(node3);
        neighbor4.add(node5);
        node4.setNeighbors(neighbor4);

        ArrayList<Node<String>> neighbor5 = new ArrayList<>();
        neighbor5.add(node1);
        node5.setNeighbors(neighbor5);


        return node1;
    }



}
