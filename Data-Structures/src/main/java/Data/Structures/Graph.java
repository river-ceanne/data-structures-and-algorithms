package Data.Structures;

import java.util.HashSet;
import java.util.LinkedList;

public class Graph {

    private int numVertices;
    private LinkedList<Integer>[] adjList;

    public Graph(){}


    public int getNumVertices() {
        return numVertices;
    }

    public void setNumVertices(int numVertices) {
        this.numVertices = numVertices;
    }

    public LinkedList<Integer>[] getAdjList() {
        return adjList;
    }

    public void setAdjList(LinkedList<Integer>[] adjList) {
        this.adjList = adjList;
    }


//AddNode()
//Adds a new node to the graph
//Takes in the value of that node
//Returns the added node

//AddEdge()
//Adds a new edge between two nodes in the graph
//Include the ability to have a “weight”
//Takes in the two nodes to be connected by the edge
//Both nodes should already be in the Graph

//GetNodes()
//Returns all of the nodes in the graph as a collection (set, list, or similar)

//GetNeighbors()
//Returns a collection of nodes connected to the given node
//Takes in a given node
//Include the weight of the connection in the returned collection

//Size()
//Returns the total number of nodes in the graph

    public Node addNode(){
        return new Node();
    }

    public void addEdge(){

    }

    public HashSet<Node> getNodes(){
        return new HashSet<>();
    }

    public HashSet<Node> getNeighbors(Node node){
        return new HashSet<>();
    }

    public int size(){
        return numVertices;
    }
}
