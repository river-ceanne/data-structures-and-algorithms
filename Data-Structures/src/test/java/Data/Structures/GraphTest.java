package Data.Structures;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;

import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void testGraphAddNode(){
        Graph graph = initialize();
        graph.addNode(6);
        Integer expected = 6;
        assertEquals(expected,graph.getNodes().get(6).getValue());
    }

    @Test
    public void testGraphAddEdge(){
        Graph graph = initialize();
        graph.addEdge(1,2,4);
        int expected = 2;
        assertEquals(expected,graph.getEdges()[1].peek().destination);
    }

    @Test
    public void testGraphAddEdgeCheckWeight(){
        Graph graph = initialize();
        graph.addEdge(1,2,4);
        int expected = 4;
        assertEquals(expected,graph.getEdges()[1].peek().weight);
    }

    @Test
    public void testGraphGetNodes(){
        Graph graph = initialize();
        assertTrue(graph.getNodes().containsKey(1));
        assertTrue(graph.getNodes().containsKey(2));

    }

    @Test
    public void testGraphGetNeighbors(){
        Graph graph = initialize();
        HashMap<Node<Integer>,Integer> neighbors = graph.getNeighbors(new Node<>(1));

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        neighbors.forEach((k,v) -> {
            System.out.println("key: " + k.getValue() + " weight:" + v);
        });

        assertEquals("key: 5 weight:2\n" +
                "key: 3 weight:7\n", outContent.toString());

    }


    @Test
    public void testGraphGetSize(){
        Graph graph = initialize();
        int expected = 5;
        assertEquals(expected,graph.size());
    }

    @Test
    public void testGraphEmpty(){
        Graph graph = new Graph();
        assertNull(graph.getNodes());
    }

    private Graph initialize(){
        Graph graph = new Graph(5);
        graph.addNode(1);
        graph.addNode(5);
        graph.addNode(2);
        graph.addNode(4);
        graph.addNode(3);

        graph.addEdge(1,5,2);
        graph.addEdge(1,3,7);

        graph.addEdge(5,3,2);
        return graph;
    }


}
