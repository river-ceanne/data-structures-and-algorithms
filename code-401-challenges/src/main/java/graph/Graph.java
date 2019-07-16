package graph;

import java.util.HashMap;
import java.util.LinkedList;

public class Graph {

    // Private variables
    private int numVertices;
    private LinkedList<Edge>[] edges;
    private HashMap<Integer,Node<Integer>> vertices;


    //Constructors
    public Graph(){ }

    public Graph(int numVertices){
        this.numVertices = numVertices;
        this.vertices = new HashMap<>();
        this.edges = new LinkedList[numVertices];

        for (int i = 0; i < numVertices; i++) {
            edges[i] = new LinkedList<>();
        }
    }

    /// GETTERS/SETTERS
    public int getNumVertices() {
        return numVertices;
    }

    public void setNumVertices(int numVertices) {
        this.numVertices = numVertices;
    }

    public LinkedList<Edge>[] getEdges() {
        return edges;
    }

    public void setEdges(LinkedList<Edge>[] edges) {
        this.edges = edges;
    }

    public HashMap<Integer,Node<Integer>> getVertices() {
        return vertices;
    }

    public void setVertices(HashMap<Integer,Node<Integer>> vertices) {
        this.vertices = vertices;
    }

    /// ------- METHODS ------- ///

    public Node<Integer> addNode(int value){

        //if graph is empty -- initialize the hashmap and linkedlist array
        if(this.getNodes() == null || this.vertices.isEmpty()){
        vertices = new HashMap<>();
        this.numVertices = 100;
        this.edges = new LinkedList[numVertices];
            for (int i = 0; i < this.numVertices; i++) {
                edges[i] = new LinkedList<>();
            }
        }

        Node<Integer> newNode = new Node(value);
        vertices.put(value, newNode);
        numVertices++;
        return newNode;
    }

    public void addEdge(int source, int destination, int weight) {
        if(vertices.containsKey(source) && vertices.containsKey(destination)){
            Edge edge = new Edge(source, destination, weight);
            edges[source].addFirst(edge); //for directed graph
        }

    }

    public HashMap<Integer,Node<Integer>> getNodes(){
        return vertices;
    }

    public HashMap<Node<Integer>,Integer> getNeighbors(Node<Integer> node){

        HashMap<Node<Integer>,Integer> neighbors = new HashMap<>();//<node,weight>

        for (Edge n: edges[node.getName()]) {
            if(n.source == node.getName()){
                neighbors.put(vertices.get(n.destination),n.weight);
            }
        }

        return neighbors;
    }

    public int size(){
        return this.vertices.size();
    }
}
