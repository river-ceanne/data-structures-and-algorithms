package Data.Structures;

public class Node {

    private String value;
    private Node nextNode;

    public Node(String value, Node nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }

    public Node(String value) {
        this.value = value;
        this.nextNode = null;
    }

    public Node() {
        this.value = "";
        this.nextNode = null;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public String getValue() {
        return value;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public void setValue(String value) {
        this.value = value;
    }


}
