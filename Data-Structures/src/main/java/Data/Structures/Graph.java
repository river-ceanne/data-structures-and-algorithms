package Data.Structures;

import java.util.HashSet;
import java.util.LinkedList;

public class Graph {

    static class Edge {
        int source;
        int destination;
        int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }


    private int vertices;
    private LinkedList<Edge>[] adjList;

    public Graph(){}

    public Graph(int vertices){
        this.vertices = vertices;
        this.adjList = new LinkedList[vertices];

        for (int i = 0; i < vertices ; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public int getVertices() {
        return vertices;
    }

    public void setVertices(int vertices) {
        this.vertices = vertices;
    }

    public LinkedList<Edge>[] getAdjList() {
        return adjList;
    }

    public void setAdjList(LinkedList<Edge>[] adjList) {
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

    public Node addNode(int value){
        Node newNode = new Node(value);
        return newNode;
    }

    public void addEgde(int source, int destination, int weight) {
        Edge edge = new Edge(source, destination, weight);
        adjList[source].addFirst(edge); //for directed graph
    }

    public HashSet<Node> getNodes(){
        return new HashSet<>();
    }

    public HashSet<Node> getNeighbors(Node<Integer> node){
        for (Edge n: adjList[node.getValue()]) {

        }
        return new HashSet<>();
    }

    public int size(){
        return vertices;
    }
}
