package graph;

import java.util.HashMap;
import java.util.LinkedList;

public class Graph<T> {

    // Private variables
    private int numVertices;
    private HashMap<T,LinkedList<Edge<T>>> edges;
    private HashMap<T,Node<T>> vertices;


    //Constructors
    public Graph(){ }

    public Graph(int numVertices){
        this.numVertices = numVertices;
        this.vertices = new HashMap<>();
        this.edges = new HashMap<>();
    }

    /// GETTERS/SETTERS
    public int getNumVertices() {
        return numVertices;
    }

    public void setNumVertices(int numVertices) {
        this.numVertices = numVertices;
    }

//    public HashMap<Node<T>,LinkedList<Edge<T>>> getEdges() {
//        return edges;
//    }

//    public void setEdges(HashMap<Node<T>,LinkedList<Edge<T>>> edges) {
//        this.edges = edges;
//    }

    public HashMap<T,Node<T>> getVertices() {
        return vertices;
    }

    public void setVertices(HashMap<T,Node<T>> vertices) {
        this.vertices = vertices;
    }

    /// ------- METHODS ------- ///

    public Node<T> addNode(T value){

        //if graph is empty -- initialize the hashmap and linkedlist array
        if(this.getNodes() == null || this.vertices.isEmpty()){
        vertices = new HashMap<>();
        this.numVertices = 100;
        this.edges = new HashMap<>();
        }

        Node<T> newNode = new Node(value);
        vertices.put(value, newNode);
        numVertices++;
        return newNode;
    }

    public void addEdge(T source, T destination, int weight) {
        if(vertices.containsKey(source) && vertices.containsKey(destination)){
            Edge edge = new Edge(source, destination, weight);
//            edges. [source].addFirst(edge); //for directed graph
        }

    }

    public HashMap<T,Node<T>> getNodes(){
        return vertices;
    }

    public HashMap<Node<T>,Integer> getNeighbors(Node<T> node){

        HashMap<Node<T>,Integer> neighbors = new HashMap<>();//<node,weight>
//
//        for (Edge n: edges[node.getName()]) {
//            if(n.source == node.getName()){
//                neighbors.put(vertices.get(n.destination),n.weight);
//            }
//        }

        return neighbors;
    }

    public int size(){
        return this.vertices.size();
    }
}
