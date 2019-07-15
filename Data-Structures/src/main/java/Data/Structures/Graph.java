package Data.Structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Graph {

    /// Inner class Edge
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

    // Private variables
    private int numVertices;
    private LinkedList<Edge>[] adjList;
    private ArrayList<Node<Integer>> vertices;


    //Constructors
    public Graph(){}

    public Graph(int numVertices){
        this.numVertices = numVertices;
        this.adjList = new LinkedList[numVertices];

        for (int i = 0; i < numVertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    /// GETTERS/SETTERS
    public int getNumVertices() {
        return numVertices;
    }

    public void setNumVertices(int numVertices) {
        this.numVertices = numVertices;
    }

    public LinkedList<Edge>[] getAdjList() {
        return adjList;
    }

    public void setAdjList(LinkedList<Edge>[] adjList) {
        this.adjList = adjList;
    }

    public ArrayList<Node<Integer>> getVertices() {
        return vertices;
    }

    public void setVertices(ArrayList<Node<Integer>> vertices) {
        this.vertices = vertices;
    }

    /// ------- METHODS ------- ///

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
        vertices.add(value, newNode);
        return newNode;
    }

    public void addEgde(int source, int destination, int weight) {
        Node sourceNode = new Node(source);
        Node destinationNode = new Node(destination);
        if(vertices.contains(sourceNode) && vertices.contains(destinationNode)){
            Edge edge = new Edge(source, destination, weight);
            adjList[source].addFirst(edge); //for directed graph
        }

    }

    public ArrayList<Node<Integer>> getNodes(){
        return vertices;
    }

    public HashMap<Node<Integer>,Integer> getNeighbors(Node<Integer> node){

        HashMap<Node<Integer>,Integer> neighbors = new HashMap<>();

        for (Edge n: adjList[node.getValue()]) {
            if(n.source == node.getValue()){
                neighbors.put(vertices.get(n.destination),n.weight);
            }
        }
        return neighbors;
    }

    public int size(){
        return numVertices;
    }
}
