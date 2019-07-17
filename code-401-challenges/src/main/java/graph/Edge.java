package graph;

public class Edge<T> {

    T source;
    T destination;
    int weight;

    public Edge(T source, T destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

}