package code.challenges;

import graph.Graph;
import org.junit.Test;

import static org.junit.Assert.assertNull;

public class BreadthFirstTest {


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

        graph.addEdge(1,2,2);
        graph.addEdge(2,3,7);

        graph.addEdge(3,4,2);
        graph.addEdge(4,5,7);

        graph.addEdge(5,1,7);

        return graph;
    }



}
