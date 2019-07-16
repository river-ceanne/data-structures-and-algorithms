package graph;

import java.util.ArrayList;

public class Node<T> {

    private T name;
    private ArrayList<Node<T>> neighbors;

    public Node(T name, ArrayList<Node<T>> neighbors) {
        this.name = name;
        this.neighbors = neighbors;
    }

    public Node(T name) {
        this.name = name;
        this.neighbors = new ArrayList<>();
    }

    public Node() { }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }


    public ArrayList<Node<T>> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(ArrayList<Node<T>> neighbors) {
        this.neighbors = neighbors;
    }
}
