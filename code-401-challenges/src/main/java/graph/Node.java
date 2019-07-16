package graph;

public class Node<T> {

    private String key;
    private T value;
    private Node nextNode;

    public Node(T value, Node nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }

    public Node(T value) {
        this.value =  value;
        this.nextNode = null;
    }

    public Node(String key, T value) {
        setKey(key);
        setValue(value);
    }

    public Node() { }

    public Node getNextNode() {
        return nextNode;
    }

    public T getValue() {
        return value;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public void setValue(T value) {
        this.value = value;
    }


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
