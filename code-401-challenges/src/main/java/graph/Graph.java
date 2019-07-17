package graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

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

    public HashMap<T,LinkedList<Edge<T>>> getEdges() {
        return edges;
    }

    public void setEdges(HashMap<T,LinkedList<Edge<T>>> edges) {
        this.edges = edges;
    }

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
        LinkedList<Edge<T>> linkedList = new LinkedList<>();
        edges.put(value,linkedList);
        numVertices++;
        return newNode;
    }

    public void addEdge(T source, T destination, int weight) {
        if(vertices.containsKey(source) && vertices.containsKey(destination)){
            Edge edge1 = new Edge(source, destination, weight);
            Edge edge2 = new Edge(destination, source, weight);

            for(Map.Entry<T,LinkedList<Edge<T>>> set: edges.entrySet()){

                LinkedList<Edge<T>> linkedList = set.getValue();

                //both underneath for undirected graph - add 2 edges on source and destination

                if(set.getKey() == source){
                    linkedList.add(edge1);
                }

                if(set.getKey() == destination){
                    linkedList.add(edge2);
                }

                set.setValue(linkedList);
            }

        }

    }

    public HashMap<T,Node<T>> getNodes(){
        return vertices;
    }

    public HashMap<Node<T>,Integer> getNeighbors(Node<T> node){

        HashMap<Node<T>,Integer> neighbors = new HashMap<>();//<node,weight>

        LinkedList<Edge<T>> linkedList = edges.get(node.getName());

        for(Edge<T> e: linkedList){
            neighbors.put(vertices.get(e.destination),e.weight);
        }

        return neighbors;
    }

    public int size(){
        return this.vertices.size();
    }
}
